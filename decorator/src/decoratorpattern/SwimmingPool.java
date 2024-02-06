package decoratorpattern;

public class SwimmingPool extends Luxury {
    public SwimmingPool(Home home) {
        super(home);
        this.luxuryCost = 55000;
        System.out.println(" For a swimming pool, you pay an extra $" + this.luxuryCost);
    }

    @Override
    public double getPrice() {
        return home.getPrice() + luxuryCost;
    }
}
