package statepattern;

public class MuteState implements PossibleState {
    public MuteState() {
        System.out.println("The TV is in Mute mode now.\n");
    }

    @Override
    public void pressOnButton(Television tvContext) {
        System.out.println("The TV was in mute mode.");
        System.out.println("So, moving to he normal state.");
        tvContext.setCurrentState(new OnState());
    }

    @Override
    public void pressOffButton(Television tvContext) {
        System.out.println("The TV was in mute mode.");
        System.out.println("So, switching off the TV.");
        tvContext.setCurrentState(new OffState());
    }

    @Override
    public void pressMuteButton(Television tvContext) {
        System.out.println("The TV was already in Mute mode.");
        System.out.println("So, ignoring this operation.");
    }

    @Override
    public String toString() {
        return "Mute mode.";
    }
}
