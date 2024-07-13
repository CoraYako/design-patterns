package mediatorpattern;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ChatServer implements Mediator {
    private List<Person> participants;

    public ChatServer() {
        this.participants = new ArrayList<>();
    }

    @Override
    public void register(Person person) {
        participants.add(person);
    }

    @Override
    public void connectEmployees(Person fromPerson, Person toPerson, String msg) throws InterruptedException {
        if (participants.contains(fromPerson)) {
            if (participants.contains(toPerson)) {
                System.out.println(fromPerson.getName() + " posts: " + msg + " at: " + LocalDateTime.now());
                Thread.sleep(1000);
                toPerson.receiveMessage(fromPerson, msg);
            } else {
                System.out.println(fromPerson.getName() +
                        ", you cannot send the message to " +
                        toPerson.getName() + ".");
                System.out.println("He/She is NOT registered user.");
            }
        } else {
            System.out.println("*** ALERT: Everyone. ***");
            System.out.println("An " + fromPerson.personType() + ": " +
                    fromPerson.getName() + " is trying to send some messages.");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("At present, the registered employees are:");
        for (Person person : participants) {
            System.out.println(person.getName());
        }
    }
}
