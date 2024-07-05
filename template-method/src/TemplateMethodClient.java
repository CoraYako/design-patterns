import templatemethodpattern.BasicEngineering;
import templatemethodpattern.ComputerScience;
import templatemethodpattern.Electronics;

public class TemplateMethodClient {
    public static void main(String[] args) {
        System.out.println("*** Template Method Pattern Demonstration ***");
        BasicEngineering preferredCourse = new ComputerScience();
        System.out.println("Computer Science course structure:");
        preferredCourse.displayCourseStructure();
        System.out.println();
        preferredCourse = new Electronics();
        System.out.println("Electronics course structure:");
        preferredCourse.displayCourseStructure();
    }
}