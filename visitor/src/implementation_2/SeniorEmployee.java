package implementation_2;

import java.util.Collection;

public class SeniorEmployee extends Employee {
    public SeniorEmployee(String name, String designation, double experience) {
        super(name, designation, experience);
    }

    @Override
    public void printStructures() {
        System.out.println("\t" + this.getName() +
                " is a " + this.designation +
                ". Experience: " + this.getExperience());
        for (Employee e : subordinates) {
            e.printStructures();
        }
    }

    @Override
    protected int getSubordinatesCount() {
        subordinatesCount = subordinates.size();
        for (Employee e : subordinates) {
            subordinatesCount += e.getSubordinatesCount();
        }
        return subordinatesCount;
    }

    @Override
    public void addEmployee(Employee e) {
        subordinates.add(e);
    }

    @Override
    protected void removeEmployee(Employee e) {
        subordinates.remove(e);
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }

    @Override
    public Collection<Employee> getSubordinates() {
        return subordinates;
    }
}
