import mvcpattern.controller.Controller;
import mvcpattern.controller.EmployeeController;
import mvcpattern.model.Employee;
import mvcpattern.model.EmployeeModel;
import mvcpattern.model.Model;
import mvcpattern.view.ConsoleView;
import mvcpattern.view.View;

public class MVCClient {
    public static void main(String[] args) {
        System.out.println("***MVC architecture Demo***");
        // Model
        Model model = new EmployeeModel();
        // View
        View view = new ConsoleView();
        // Controller
        Controller controller = new EmployeeController(model, view);
        controller.displayEnrolledEmployees();
        // Add an employee
        Employee kevin = new Employee("Kevin", "E4");
        controller.addEmployee(kevin);
        controller.displayEnrolledEmployees();
        // Remove an existing employee using
        // the employee id.
        controller.removeEmployee("E2");
        controller.displayEnrolledEmployees();
        // Cannot remove an employee who does not
        // belong to the registered list.
        controller.removeEmployee("E5");
        controller.displayEnrolledEmployees();
        // Avoiding duplicate entries.
        controller.addEmployee(kevin);
        controller.addEmployee(new Employee("Kate", "E4"));
    }
}
