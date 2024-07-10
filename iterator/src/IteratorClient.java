import iteratorpattern.v1.ArtsDepartment;
import iteratorpattern.v1.Department;
import iteratorpattern.v1.Iterator;
import iteratorpattern.v2.Database;
import iteratorpattern.v2.Employee;
import iteratorpattern.v2.EmployeeDatabase;
import iteratorpattern.v2.EmployeeIterator;

public class IteratorClient {
    public static void main(String[] args) {
        System.out.println("*** Iterator Pattern Demonstration (v1) ***\n");
        Department arts = new ArtsDepartment();
        Iterator artsIterator = arts.createIterator();
        System.out.println("Iterating over the Arts subjects:\n");
        while (artsIterator.hasNext()) {
            System.out.println(artsIterator.next());
        }
        // moving back to the first element
        artsIterator.first();
        System.out.println("\nThe pointer moves to -> " + artsIterator.currentElement());

        System.out.println();

        System.out.println("*** Iterator Pattern Demonstration (v2) ***");
        Database employeeList = new EmployeeDatabase();
        java.util.Iterator<Employee> employeeIterator = employeeList.createIterator();
        System.out.println("Iterating over the employee list:\n");
        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());
        }
        // moving back to first the element
        ((EmployeeIterator) employeeIterator).first();
        Employee pointer = ((EmployeeIterator) employeeIterator).currentItem();
        System.out.println("\nThe pointer moves to -> " + pointer);
    }
}