package statepattern;

public class Television {
    private PossibleState currentState;

    public Television() {
        // starting with OFF state
        this.currentState = new OffState();
    }

    public PossibleState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PossibleState currentState) {
        this.currentState = currentState;
    }

    public void executeOnButton() {
        System.out.println("You pressed the ON button.");
        // delegating the state behavior
        currentState.pressOnButton(this);
    }

    public void executeOffButton() {
        System.out.println("You pressed the OFF button.");
        // delegating the state behavior
        currentState.pressOffButton(this);
    }

    public void executeMuteButton() {
        System.out.println("You pressed the Mute button.");
        // delegating the state behavior
        currentState.pressMuteButton(this);
    }
}
