package commandpattern;

public interface Command {
    // to execute a command
    void executeCommand();

    // to undo last commando execution
    void undoPreviousCommand();
}
