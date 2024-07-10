package iteratorpattern.v2;

import java.util.Iterator;

public interface Database {
    Iterator<Employee> createIterator();
}
