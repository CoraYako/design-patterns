package iteratorpattern.v1;

public class ArtsIterator implements Iterator {
    private final String[] subjects;
    private int currentPointer;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        currentPointer = 0;
    }

    @Override
    public void first() {
        currentPointer = 0;
    }

    @Override
    public String next() {
        return subjects[currentPointer++];
    }

    @Override
    public String currentElement() {
        return subjects[currentPointer];
    }

    @Override
    public boolean hasNext() {
        return currentPointer >= subjects.length ? false : true;
    }
}
