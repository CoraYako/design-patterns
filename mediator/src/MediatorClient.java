import mediatorpattern.ChatServer;
import mediatorpattern.Employee;
import mediatorpattern.Outsider;
import mediatorpattern.Person;

public class MediatorClient {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*** Mediator Pattern Demonstration ***\n");
        ChatServer mediator = new ChatServer();
        Person amit = new Employee(mediator, "Amit");
        Person sohel = new Employee(mediator, "Shoel");
        Person joseph = new Outsider(mediator, "Joseph");
        // registering participants
        mediator.register(amit);
        mediator.register(sohel);
        mediator.register(joseph);
        // displaying the participant's list
        mediator.displayDetails();
        System.out.println("Communication starts among participants...");
        amit.sendMessage(sohel, "Hi Joseph, how do you do?");
        sohel.sendMessage(amit, "Hi Amit. Yup, we can discuss now.");
        joseph.sendMessage(amit, "Hello, friend.");
        // Another employee (Todd). He does not register to the mediator
        Person todd = new Employee(mediator, "Todd");
        // Todd is an employee, but not a registered user.
        // He cannot send messages to a registered user.
        // He cannot receive any message from a registered user either.
        todd.sendMessage(joseph, "Hello, Joseph...");
        amit.sendMessage(todd, "Hello, Todd...");
        // an outsider person tries to participate
        Person jack = new Outsider(mediator, "Jack");
        // this message also cannot reach Joseph because Jack is not a registered user
        jack.sendMessage(joseph, "Hello, Joseph...");
    }
}