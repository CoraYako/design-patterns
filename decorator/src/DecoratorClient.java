import decoratorpattern.*;

public class DecoratorClient {
    public static void main(String[] args) {
        System.out.println("***Using wrappers in different scenarios.***\n");
        System.out.println("Scenario-1: Making a basic home with standard facilities.");
        Home home = new BasicHome();
        System.out.println("Total cost: $" + home.getPrice());

        System.out.println("\nScenario-2: Making a basic home. Then adding a playground.");
        home = new BasicHome();
        home = new PlayGround(home);
        System.out.println("Total cost: $" + home.getPrice());

        System.out.println("\nScenario-3: Making a basic home. Then adding two playgrounds one-by-one.");
        home = new BasicHome();
        home = new PlayGround(home);
        home = new PlayGround(home);
        System.out.println("Total cost: $" + home.getPrice());

        System.out.println("\nScenario-4: Making a basic home. Then adding one additional playground and swimming pool.");
        home = new BasicHome();
        home = new PlayGround(home);
        home = new SwimmingPool(home);
        System.out.println("Total cost: $" + home.getPrice());

        System.out.println("\nScenario-5: Adding a swimming pool and then a playground to a basic home.");
        home = new BasicHome();
        home = new SwimmingPool(home);
        home = new PlayGround(home);
        System.out.println("Total cost: $" + home.getPrice());

        System.out.println("\nScenario-6: Making an advanced home now.");
        home = new AdvancedHome();
        System.out.println("Total cost: $" + home.getPrice());

        System.out.println("\nScenario-7: Making an advanced home. Then adding one additional playground to it.");
        home = new AdvancedHome();
        home = new PlayGround(home);
        System.out.println("Total cost: $" + home.getPrice());

        System.out.println("\nScenario-8: Making an advanced home. Then adding one additional playground and one swimming pool to it.");
        home = new AdvancedHome();
        home = new PlayGround(home);
        home = new SwimmingPool(home);
        System.out.println("Total cost: $" + home.getPrice());
    }
}