package commandpattern;

public class SubtractionCommand implements Command {
    private NumberGenerator numberGenerator;

    public SubtractionCommand(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    @Override
    public void executeCommand() {
        System.out.println("Applying decrement.");
        numberGenerator.decrementNumber();
    }

    @Override
    public void undoPreviousCommand() {
        System.out.println("Undoing the decrement command.");
        numberGenerator.incrementNumber();
    }
}
