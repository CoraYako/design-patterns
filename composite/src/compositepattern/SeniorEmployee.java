package compositepattern;

public class SeniorEmployee extends Employee {
    public SeniorEmployee(String name, String designation) {
        super(name, designation);
    }

    @Override
    public void printStructures() {
        System.out.println("\t" + this.name + " is a " + this.designation);
        for (Employee e : subordinates) {
            e.printStructures();
        }
    }

    @Override
    public int getSubordinatesCount() {
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
    public void removeEmployee(Employee e) {
        subordinates.remove(e);
    }
}
