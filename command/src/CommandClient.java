import commandpattern.*;

public class CommandClient {
    public static void main(String[] args) {
        System.out.println("*** Command Pattern Demonstration ***\n");
        // Client holds both the Invoker
        // and Command Objects.
        RemoteControlInvoker invoker = new RemoteControlInvoker();
        System.out.println("-----Testing the game scenarios-----\n");
        // Initializing a receiver
        Game gameName = new Game("Golf");
        // Initializing commands to start and stop a game.
        GameStartCommand gameStartCommand = new GameStartCommand(gameName);
        GameStopCommand gameStopCommand = new GameStopCommand(gameName);
        System.out.println("Starting the game.");
        invoker.setCommand(gameStartCommand);
        invoker.executeCommand();
        System.out.println("\nIssueing a stop command now.");
        invoker.setCommand(gameStopCommand);
        invoker.executeCommand();
        System.out.println("\n---Testing the number scenarios---\n");
        // Initializing a receiver
        NumberGenerator numberGenerator = new NumberGenerator();
        // Initializing commands to start and stop a game.
        AdditionCommand addNumberCommand = new AdditionCommand(numberGenerator);
        invoker.setCommand(addNumberCommand);
        System.out.println("\nWe'll test a series of do/undo operations now.**");
        System.out.println("Incrementing a number three times.");
        invoker.executeCommand();
        invoker.executeCommand();
        invoker.executeCommand();
        System.out.println("Undoing the last command only.");
        invoker.undoCommand();
        System.out.println("Calling the undoAllStoredCommands() now.");
        invoker.undoAllStoredCommands();
    }
}