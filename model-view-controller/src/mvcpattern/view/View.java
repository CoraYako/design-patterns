package mvcpattern.view;

import mvcpattern.model.Employee;

import java.util.List;

public abstract class View {
    public abstract void showEnrolledEmployees(List<Employee> enrolledEmployees);
}
