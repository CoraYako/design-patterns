package implementation_1;

public class IncrementorVisitor implements Visitor {
    @Override
    public void visitNumber(IntegerProcessor intProcessor) {
        System.out.println("The flag value is: " + intProcessor.getNumber());
        System.out.println("Incrementing it by 10.");
        int temp = intProcessor.getNumber() + 10;
        System.out.println("The new value is: " + temp);
    }
}
