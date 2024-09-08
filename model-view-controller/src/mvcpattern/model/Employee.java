package mvcpattern.model;

public class Employee {
    private String empName;
    private String empId;

    public Employee(String empName, String empId) {
        this.empName = empName;
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return empName + "'s employee id is: " + empId;
    }
}
