package statepattern;

public class OnState implements PossibleState {
    public OnState() {
        System.out.println("The TV is On now.\n");
    }

    @Override
    public void pressOnButton(Television tvContext) {
        System.out.print("The TV was already on.");
        System.out.println("Ignoring repeated on button press operation.");
    }

    @Override
    public void pressOffButton(Television tvContext) {
        System.out.println("The TV was on. So, switching off the TV.");
        tvContext.setCurrentState(new OffState());
    }

    @Override
    public void pressMuteButton(Television tvContext) {
        System.out.println("The TV was on. So,moving to the silent mode.");
        tvContext.setCurrentState(new MuteState());
    }

    @Override
    public String toString() {
        return "Switched on.";
    }
}
