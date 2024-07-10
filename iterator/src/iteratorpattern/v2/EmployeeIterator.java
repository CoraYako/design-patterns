package iteratorpattern.v2;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeIterator implements Iterator<Employee> {
    private LinkedList<Employee> employeeList;
    private int currentPointer;

    public EmployeeIterator(LinkedList<Employee> employeeList) {
        this.employeeList = employeeList;
        currentPointer = 0;
    }

    public void first() {
        currentPointer = 0;
    }

    public Employee currentItem() {
        return employeeList.get(currentPointer);
    }

    @Override
    public boolean hasNext() {
        return currentPointer >= employeeList.size() ? false : true;
    }

    @Override
    public Employee next() {
        return employeeList.get(currentPointer++);
    }
}
