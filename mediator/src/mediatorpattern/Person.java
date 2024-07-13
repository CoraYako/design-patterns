package mediatorpattern;

public abstract class Person {
    protected Mediator mediator;
    protected String name;

    public Person(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(Person toEmp, String msg) throws InterruptedException {
        mediator.connectEmployees(this, toEmp, msg);
    }

    public abstract String personType();

    public void receiveMessage(Person fromEmp, String msg) {
        System.out.println(this.getName() + " had read " + fromEmp.getName() + "'s message.");
    }
}
