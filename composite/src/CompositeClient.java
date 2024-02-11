import compositepattern.Employee;
import compositepattern.JuniorEmployee;
import compositepattern.SeniorEmployee;

public class CompositeClient {
    public static void main(String[] args) {
        System.out.println("***Composite Pattern Demonstration.***");
        Employee hodMath = formMathDept();
        Employee hodCompSc = formComputerScDept();
        Employee principal = formPrincipal(hodMath, hodCompSc);
        /*
        Printing the leaf-nodes and branches
        in the same way i.e.
        in each case, we are calling
        printStructures() method.
        */
        System.out.println("The details of the Principal object:");
        // Prints the complete college structure
        principal.printStructures();
        System.out.println("\n The details of the HOD(Computer Sc.) object:");
        // Prints the details of Computer Science
        // department
        hodCompSc.printStructures();
        System.out.println("\n The details of the HOD(Mathematics) object:");
        // Prints the details of Mathematics department
        hodMath.printStructures();
        // Leaf node
        System.out.println("\n The structure of a Junior employee(leaf node):");
        hodMath.subordinates.get(0).printStructures();
        // Current management details
        displayManagementDetail(principal, hodCompSc, hodMath);
        System.out.println("\nThe lecturer Mr. C.Jones(cseTeacher2) resigns.");
        hodCompSc.removeEmployee(hodCompSc.subordinates.get(1));
        System.out.println("The organization has the following members now:");
        principal.printStructures();
        // Current management details
        displayManagementDetail(principal, hodCompSc, hodMath);
        System.out.println("Testing the structure of some junior employee's:");
        Employee juniorMathTeacher1 = hodMath.subordinates.get(0);
        Employee juniorCSETeacher1 = hodCompSc.subordinates.get(0);
        System.out.println("The Lecturer( M.Jacob) manages " + juniorMathTeacher1.getSubordinatesCount() + " employee(s).");
        System.out.println("The Lecturer( C.Kate) manages " + juniorCSETeacher1.getSubordinatesCount() + " employee(s).");
    }

    private static Employee formComputerScDept() {
        System.out.println("Forming Computer Science department.");
        System.out.println("A HOD with three lecturers is here.\n");
        Employee cseTeacher1 = new JuniorEmployee("C.Kate", "Lecturer");
        Employee cseTeacher2 = new JuniorEmployee("C.Jones", "Lecturer");
        Employee cseTeacher3 = new JuniorEmployee("C.Proctor", "Lecturer");
        Employee hodCompSc = new SeniorEmployee("Mr. V.Sarcar", "HOD(CSE)");
        // Teachers of Computer Science
        // directly reports to HOD-CSE
        hodCompSc.addEmployee(cseTeacher1);
        hodCompSc.addEmployee(cseTeacher2);
        hodCompSc.addEmployee(cseTeacher3);
        return hodCompSc;
    }

    private static Employee formMathDept() {
        System.out.println("Forming Mathematics department.");
        System.out.println("A HOD with two lecturers is here.\n");
        // Two lecturers other than HOD work
        // in the Mathematics department.
        Employee mathTeacher1 = new JuniorEmployee("M.Jacob", "Lecturer");
        Employee mathTeacher2 = new JuniorEmployee("M.Rustom", "Lecturer");
        Employee hodMath = new SeniorEmployee("Mrs.S.Das", "HOD(Math)");
        // Teachers of Mathematics directly
        // reports to HOD-Mathematics
        hodMath.addEmployee(mathTeacher1);
        hodMath.addEmployee(mathTeacher2);
        return hodMath;
    }

    private static Employee formPrincipal(Employee hodMath, Employee hodCompSc) {
        System.out.println("Forming the top-level management.");
        System.out.println("A principal with two HOD's is here.\n");
        // Principal of the college
        Employee principal = new SeniorEmployee("Dr.S.Som", "Principal");
         /*
         The Principal is on top of the college.
         The HOD(Mathematics) and
         HOD(Computer Science) directly report
         to him.
         */
        principal.addEmployee(hodMath);
        principal.addEmployee(hodCompSc);
        return principal;
    }

    private static void displayManagementDetail(Employee principal, Employee hodCompSc, Employee hodMaths) {
        System.out.println("\n---The current management status summary:---");
        System.out.println("The Principal manages " + principal.getSubordinatesCount() + " employee(s).");
        System.out.println("The HOD(Computer Sc.) manages " + hodCompSc.getSubordinatesCount() + " employee(s).");
        System.out.println("The HOD(Mathematics) manages " + hodMaths.getSubordinatesCount() + " employee(s).");
        System.out.println("--------");
    }
}