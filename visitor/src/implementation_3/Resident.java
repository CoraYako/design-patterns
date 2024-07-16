package implementation_3;

public class Resident extends Client {
    public Resident(String name, String address, String number) {
        super(name, address, number);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitResident(this);
    }
}
