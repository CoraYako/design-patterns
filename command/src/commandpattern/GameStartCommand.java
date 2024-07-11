package commandpattern;

public class GameStartCommand implements Command {
    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void executeCommand() {
        System.out.println(game.gameName + " game is about to start.");
        game.start();
        game.displayScore();
    }

    @Override
    public void undoPreviousCommand() {
        System.out.println("Undoing the start command.");
        game.stop();
    }
}
