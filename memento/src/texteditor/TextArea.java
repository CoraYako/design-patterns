package texteditor;

/*
 * This class will act as the Originator class that will do the following:
 * 1. Create a memento that contains a snapshot of its current state
 * 2. Use a memento to restore its internal state
 * */
public class TextArea {
    private String text;

    public void set(String text) {
        this.text = text;
    }

    public Memento takeSnapshot() {
        return new Memento(this.text);
    }

    public void restore(Memento memento) {
        this.text = memento.getSavedState();
    }

    public static class Memento {

        private final String state;

        private Memento(String state) {
            this.state = state;
        }

        private String getSavedState() {
            return state;
        }
    }
}
