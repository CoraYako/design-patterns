package implementation_2;

public class JuniorEmployee extends Employee {
    public JuniorEmployee(String name, String designation, double experience) {
        super(name, designation, experience);
    }

    @Override
    public void printStructures() {
        System.out.println("\t\t" + this.getName() +
                " is a " + this.designation +
                ". Experience: " + this.getExperience());
    }

    @Override
    protected int getSubordinatesCount() {
        return subordinatesCount;
    }

    @Override
    public void addEmployee(Employee e) {

    }

    @Override
    protected void removeEmployee(Employee e) {

    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }
}
