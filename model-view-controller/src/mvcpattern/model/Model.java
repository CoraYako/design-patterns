package mvcpattern.model;

import java.util.List;

public abstract class Model {
    public abstract List<Employee> getEnrolledEmployeeDetailsFromModel();

    public abstract void addEmployeeToModel(Employee employeee);

    public abstract void removeEmployeeFromModel(String employeeId);
}
