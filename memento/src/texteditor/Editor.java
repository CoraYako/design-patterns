package texteditor;

import java.util.Deque;
import java.util.LinkedList;

/*
 * This class will act as a Caretaker
 * */
public class Editor {
    private Deque<TextArea.Memento> stateHistory;
    private TextArea textArea;

    public Editor() {
        this.stateHistory = new LinkedList<>();
        this.textArea = new TextArea();
    }

    public void write(String text) {
        textArea.set(text);
        stateHistory.add(textArea.takeSnapshot());
    }

    public void undo() {
        textArea.restore(stateHistory.pop());
    }
}
