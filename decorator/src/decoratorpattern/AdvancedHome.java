package decoratorpattern;

public class AdvancedHome extends Home {
    public AdvancedHome() {
        additionalCost = 25000;
        System.out.println(" It becomes an advanced home with more facilities.");
        System.out.println(" You need to pay $" + this.getPrice() + " for this.");
    }

    @Override
    public double getPrice() {
        return basePrice + additionalCost;
    }
}
