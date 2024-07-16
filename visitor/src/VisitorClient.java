import implementation_1.*;
import implementation_2.Employee;
import implementation_2.JuniorEmployee;
import implementation_2.PromotionCheckerVisitor;
import implementation_2.SeniorEmployee;

public class VisitorClient {
    public static void main(String[] args) {
        System.out.println("*** Visitor Pattern Demonstration 1 ***\n");
        NumberProcessor targetInteger = new IntegerProcessor();
        System.out.println("Testing the IncrementorVisitor now.");
        Visitor visitor = new IncrementorVisitor();
        targetInteger.acceptVisitor(visitor);
        System.out.println("\nTesting the DoubleMakerVisitor now.");
        visitor = new DoubleMakerVisitor();
        targetInteger.acceptVisitor(visitor);
        System.out.println();
        System.out.println("*** Visitor Pattern with Composite Pattern Demonstration 2 ***");
        Employee hodMath = formMathDept();
        Employee hodCompSc = formComputerScDept();
        Employee principal = formPrincipal(hodMath, hodCompSc);
        printCollegeStructure(principal);
        implementation_2.Visitor collegeVisitor = new PromotionCheckerVisitor();
        System.out.println("\nChecking potential candidates for the promotion:");
        visitCandidates(principal, collegeVisitor);
    }

    /*
     * print the leaf-nodes and branches in the same way
     * i.e., in each case, we are calling printStructure() method
     * */
    private static void printCollegeStructure(Employee principal) {
        System.out.println("The details of the Principal object:");
        principal.printStructures();
    }

    private static Employee formComputerScDept() {
        Employee cseTeacher1 = new JuniorEmployee("C.Kate", "Lecturer", 8.2);
        Employee cseTeacher2 = new JuniorEmployee("C.Jones", "Lecturer", 4.5);
        Employee cseTeacher3 = new JuniorEmployee("C.Proctor", "Lecturer", 6);
        Employee hodCompSc = new SeniorEmployee("Mr. V.Sarcar", "HDO(CSE)", 15.5);
        // adding teachers of CSE to HOD
        hodCompSc.addEmployee(cseTeacher1);
        hodCompSc.addEmployee(cseTeacher2);
        hodCompSc.addEmployee(cseTeacher3);
        return hodCompSc;
    }

    private static Employee formMathDept() {
        Employee mathTeacher1 = new JuniorEmployee("M.Jacob", "Lecturer", 7.5);
        Employee mathTeacher2 = new JuniorEmployee("M.Rustom", "Lecturer", 3);
        Employee hodMath = new SeniorEmployee("Mrs.S.Das", "HOD(Math)", 12.5);
        // adding teachers of MathDept to HOD
        hodMath.addEmployee(mathTeacher1);
        hodMath.addEmployee(mathTeacher2);
        return hodMath;
    }

    private static Employee formPrincipal(Employee hodMath, Employee hodCompSc) {
        // principal of the college
        Employee principal = new SeniorEmployee("Dr.S.Som", "Principal", 21);
        // adding the two HOD from MATH and CSE departments
        principal.addEmployee(hodMath);
        principal.addEmployee(hodCompSc);
        return principal;
    }

    private static void visitCandidates(Employee emp, implementation_2.Visitor visitor) {
        emp.acceptVisitor(visitor);
        emp.getSubordinates().forEach(e -> visitCandidates(e, visitor));
    }
}