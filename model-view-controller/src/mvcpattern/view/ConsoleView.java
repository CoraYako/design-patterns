package mvcpattern.view;

import mvcpattern.model.Employee;

import java.util.List;

public class ConsoleView extends View {
    @Override
    public void showEnrolledEmployees(List<Employee> enrolledEmployees) {
        System.out.println("\n ***This is a console view of currently enrolled employees.*** ");
        for (Employee employee : enrolledEmployees) {
            System.out.println(employee);
        }
        System.out.println("---------------------");
    }
}
