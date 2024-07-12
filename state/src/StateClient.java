import statepattern.Television;

public class StateClient {
    public static void main(String[] args) {
        System.out.println("*** State Pattern Demonstration ***\n");
        // TV is initialized with OFF state
        Television tv = new Television();
        System.out.println("User is pressing buttons in the following sequence:");
        System.out.println("Off -> Mute -> On -> On -> Mute -> Mute -> On -> Off\n");
        // TV is off. Pressing the off button again
        tv.executeOffButton();
        // pressing the mute button when the TV is off
        tv.executeMuteButton();
        // checking the current state
        System.out.println("Current state: " + tv.getCurrentState());
        // switching On the TV
        tv.executeOnButton();
        // checking the current state
        System.out.println("Current state: " + tv.getCurrentState());
        // pressing the On button again when the TV i On
        tv.executeOnButton();
        // putting the TV in the mute mode
        tv.executeMuteButton();
        // TV is already muted. Pressing the Mute button again
        tv.executeMuteButton();
        // checking the current state
        System.out.println("Current state: " + tv.getCurrentState());
        // TV is silent now. Pressing the On button now
        tv.executeOnButton();
        // switching off the TV now
        tv.executeOffButton();
        System.out.println("Current state: " + tv.getCurrentState());
    }
}