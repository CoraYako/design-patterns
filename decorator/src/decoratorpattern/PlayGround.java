package decoratorpattern;

public class PlayGround extends Luxury {
    public PlayGround(Home home) {
        super(home);
        this.luxuryCost = 20000;
        System.out.println(" For a playground, you pay an extra $" + this.luxuryCost);
    }

    @Override
    public double getPrice() {
        return home.getPrice() + luxuryCost;
    }
}
