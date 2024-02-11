package compositepattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    protected String name;
    protected String dept;
    protected String designation;
    protected int subordinatesCount;
    public List<Employee> subordinates;

    // Constructor
    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
        this.subordinatesCount = 0;
        subordinates = new ArrayList<>();
    }

    public abstract void printStructures();

    public abstract int getSubordinatesCount();

    public abstract void addEmployee(Employee e);

    public abstract void removeEmployee(Employee e);
}
