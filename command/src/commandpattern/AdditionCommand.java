package commandpattern;

public class AdditionCommand implements Command {
    private NumberGenerator numberGenerator;

    public AdditionCommand(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    @Override
    public void executeCommand() {
        System.out.println("Executing incrementation now.");
        numberGenerator.incrementNumber();
    }

    @Override
    public void undoPreviousCommand() {
        System.out.println("Undoing previous executed command.");
        numberGenerator.decrementNumber();
    }
}
