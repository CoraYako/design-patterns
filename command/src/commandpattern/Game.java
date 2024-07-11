package commandpattern;

public class Game {
    String gameName;

    public Game(String gameName) {
        this.gameName = gameName;
    }

    public void start() {
        System.out.println(gameName + " is on.");
    }

    public void displayScore() {
        System.out.println("The score is changing from time to time.");
    }

    public void stop() {
        System.out.println("The " + gameName + " game is stopped.");
    }
}
