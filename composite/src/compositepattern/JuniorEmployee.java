package compositepattern;

public class JuniorEmployee extends Employee {
    public JuniorEmployee(String name, String designation) {
        super(name, designation);
    }

    @Override
    public void printStructures() {
        System.out.println("\t\t" + this.name + " is a " + this.designation);
    }

    @Override
    public int getSubordinatesCount() {
        return subordinatesCount; //Always 0
    }

    @Override
    public void addEmployee(Employee e) {
        // Empty method
    }

    @Override
    public void removeEmployee(Employee e) {
        // Empty method
    }
}
