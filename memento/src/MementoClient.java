import mementopattern.Memento;
import mementopattern.Originator;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the caretaker class. As per GoF:
 * 1. This class is responsible for memento's safe-keeping.
 * 2. Never operates or Examines the content of a Memento.
 */
public class MementoClient {
    static Originator originator;
    static List<Memento> savedMementos;

    public static void main(String[] args) {
        System.out.println("***Memento Pattern Demonstration.***\n");
        originator = new Originator();
        savedMementos = new ArrayList<>();
        // Snapshot #0
        saveSnapShot(originator, "Snapshot #0", savedMementos);
        // Snapshot #1
        saveSnapShot(originator, "Snapshot #1", savedMementos);
        // Snapshot #2
        saveSnapShot(originator, "Snapshot #2", savedMementos);
        // Snapshot #3
        saveSnapShot(originator, "Snapshot #3", savedMementos);
        // Snapshot #4. Taking a snapshot, but not adding as a restore point.
        originator.setState("Snapshot #4");
        // Roll everything back...
        System.out.println("\n\nStarted restoring process...");
        for (int i = savedMementos.size(); i > 0; i--) {
            // Get a restore point
            originator.restore(savedMementos.get(i - 1));
        }
        System.out.println("\nPerforming redo's now.");
        for (int i = 2; i <= savedMementos.size(); i++) {
            // Get a restore point
            originator.restore(savedMementos.get(i - 1));
        }
        // restoring to any specified checkpoint
        System.out.println("\nRestoring to Snapshot #1.");
        originator.restore(savedMementos.get(1));
    }

    private static void saveSnapShot(Originator originator,
                                     String checkPoint,
                                     List<Memento> savedMementos) {
        // setting a new state
        originator.setState(checkPoint);
        // set the current state from the originator through a memento
        Memento memento = originator.getMemento();
        System.out.println(". Saving this checkpoint.");
        savedMementos.add(memento);
    }
}