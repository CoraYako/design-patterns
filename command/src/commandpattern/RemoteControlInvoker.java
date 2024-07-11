package commandpattern;

import java.util.ArrayList;

public class RemoteControlInvoker {
    Command currentCommand, lastCommandPerformed;
    ArrayList<Command> savedCommands = new ArrayList<>();

    public void setCommand(Command command) {
        this.currentCommand = command;
    }

    public void executeCommand() {
        currentCommand.executeCommand();
        lastCommandPerformed = currentCommand;
        savedCommands.add(currentCommand);
    }

    public void undoCommand() {
        lastCommandPerformed.undoPreviousCommand();
        savedCommands.remove(lastCommandPerformed);
    }

    public void undoAllStoredCommands() {
        for (int i = savedCommands.size(); i > 0; i--) {
            // Get a restore point and undo previous commands
            (savedCommands.get(i - 1)).undoPreviousCommand();
        }
        // Removing everything from the saved list
        savedCommands.clear();
    }
}
