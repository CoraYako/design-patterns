package mvcpattern.controller;

import mvcpattern.model.Employee;
import mvcpattern.model.Model;
import mvcpattern.view.View;

public abstract class Controller {
    protected Model model;
    protected View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public abstract void displayEnrolledEmployees();

    public abstract void addEmployee(Employee employee);

    public abstract void removeEmployee(String employeeId);
}
