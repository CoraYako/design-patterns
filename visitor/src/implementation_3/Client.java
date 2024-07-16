package implementation_3;

public abstract class Client {
    private final String name;
    private final String address;
    private final String number;

    Client(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public abstract void accept(Visitor visitor);
}
