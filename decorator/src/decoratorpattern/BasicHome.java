package decoratorpattern;

public class BasicHome extends Home {
    public BasicHome() {
        // No additional cost for a basic home.
        System.out.println(" The basic home with some standard facilities are ready.");
        System.out.println(" You need to pay $" + this.getPrice() + " for this.");
    }

    @Override
    public double getPrice() {
        // There is no additional cost for a basic home
        // So, returning the basic price is sufficient.
        return basePrice;
    }
}
