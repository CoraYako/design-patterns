package simplefactory.model;

public class Tiger implements Animal {
    public Tiger() {
        System.out.println("\nA tiger is created.");
    }

    @Override
    public void displayBehavior() {
        System.out.println("Tiger says: Halum.");
        System.out.println("It loves to roam in a jungle.");
    }
}
