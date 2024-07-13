package mediatorpattern;

public interface Mediator {
    // to register an employee
    void register(Person person);

    // to send a message from one employee to another employee
    void connectEmployees(Person fromPerson, Person toPerson, String msg) throws InterruptedException;

    // to display currently registered members
    void displayDetails();
}
