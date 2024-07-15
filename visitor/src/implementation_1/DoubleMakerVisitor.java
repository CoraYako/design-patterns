package implementation_1;

public class DoubleMakerVisitor implements Visitor {
    @Override
    public void visitNumber(IntegerProcessor intProcessor) {
        System.out.println("The flag value is: " + intProcessor.getNumber());
        System.out.println("Multiplying it by 2.");
        int temp = intProcessor.getNumber() * 2;
        System.out.println("The new value is: " + temp);
    }
}
