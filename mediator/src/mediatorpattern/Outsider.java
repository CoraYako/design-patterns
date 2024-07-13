package mediatorpattern;

public class Outsider extends Person {
    public Outsider(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    @Override
    public String personType() {
        return "";
    }
}
