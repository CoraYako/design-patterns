package commandpattern;

public class GameStopCommand implements Command {
    private Game game;

    public GameStopCommand(Game game) {
        this.game = game;
    }

    @Override
    public void executeCommand() {
        System.out.println("Finishing " + game.gameName + " game.");
        game.stop();
    }

    @Override
    public void undoPreviousCommand() {
        System.out.println("Undoing the stop command.");
        game.start();
        game.displayScore();
    }
}
