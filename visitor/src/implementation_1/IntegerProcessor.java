package implementation_1;

public class IntegerProcessor implements NumberProcessor {
    private final int number;

    public IntegerProcessor() {
        this.number = 5; // default value
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitNumber(this);
    }
}
