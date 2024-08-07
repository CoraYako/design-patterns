package statepattern;

public interface PossibleState {
    void pressOnButton(Television tvContext);
    void pressOffButton(Television tvContext);
    void pressMuteButton(Television tvContext);
}
