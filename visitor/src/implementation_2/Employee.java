package implementation_2;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    protected String name;
    protected String designation;
    protected int subordinatesCount;
    protected List<Employee> subordinates;
    protected final double experience;

    public Employee(String name, String designation, double experience) {
        this.name = name;
        this.designation = designation;
        this.experience = experience;
        this.subordinatesCount = 0;
        subordinates = new ArrayList<>();
    }

    public abstract void printStructures();

    protected abstract int getSubordinatesCount();

    public abstract void addEmployee(Employee e);

    protected abstract void removeEmployee(Employee e);

    public double getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public abstract void acceptVisitor(Visitor visitor);
}
