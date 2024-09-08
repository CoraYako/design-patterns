package mvcpattern.controller;

import mvcpattern.model.Employee;
import mvcpattern.model.Model;
import mvcpattern.view.View;

import java.util.List;

public class EmployeeController extends Controller {
    public EmployeeController(Model model, View view) {
        super(model, view);
    }

    @Override
    public void displayEnrolledEmployees() {
        // Get the data from the model layer
        List<Employee> enrolledEmployees = model.getEnrolledEmployeeDetailsFromModel();
        // Connect to the view layer
        view.showEnrolledEmployees(enrolledEmployees);
    }

    // Sending a request to model to add an
    // employee to the list.
    @Override
    public void addEmployee(Employee employee) {
        model.addEmployeeToModel(employee);
    }

    // Sending a request to model to remove
    // an employee from the list.
    @Override
    public void removeEmployee(String employeeId) {
        model.removeEmployeeFromModel(employeeId);
    }
}
