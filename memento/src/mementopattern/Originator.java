package mementopattern;

/**
 * This is the originator class. As per GoF:
 * 1. It creates a memento that contains a snapshot of
 * its current internal state.
 * 2. It uses a memento to restore its internal state.
 */
public class Originator {
    private String state;

    // setting a new internal state
    public void setState(String newState) {
        this.state = newState;
        System.out.println("The current state is " + state);
    }

    // back to old state (restore)
    public void restore(Memento memento) {
        // the following line is ok due to package-private visivility
        this.state = memento.state;
        System.out.println("Restored to state: " + state);
    }

    // The Originator (which contains its current state)
    // will supply the memento in response to the
    // caretaker's request.
    public Memento getMemento() {
        return new Memento(state);
    }
}
