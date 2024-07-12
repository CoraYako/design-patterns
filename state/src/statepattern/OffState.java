package statepattern;

public class OffState implements PossibleState {
    public OffState() {
        System.out.println("The TV is Off now.\n");
    }

    @Override
    public void pressOnButton(Television tvContext) {
        System.out.println("The TV was Off. Going from Off to On state.");
        tvContext.setCurrentState(new OnState());
    }

    @Override
    public void pressOffButton(Television tvContext) {
        System.out.print("The TV was already in Off state.");
        System.out.println("So, ignoring this operation.");
    }

    @Override
    public void pressMuteButton(Television tvContext) {
        System.out.print("The TV was already off.");
        System.out.println("So, ignoring this operation.");
    }

    @Override
    public String toString() {
        return "Switched off.";
    }
}
