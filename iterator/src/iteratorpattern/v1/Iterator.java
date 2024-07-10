package iteratorpattern.v1;

public interface Iterator {
    void first(); // reset to the first element
    String next(); // to get the next element
    String currentElement(); // to retrieve the current element
    boolean hasNext(); // to check if there is next element
}
