package bridgepattern;

public abstract class ElectronicItem {
    protected double cost;
    protected String productType;
    protected PriceType priceType;

    public ElectronicItem(PriceType priceType) {
        this.priceType = priceType;
    }

    public void showPriceDetails() {
        priceType.displayProductPrice(productType, cost);
    }

    public void getDiscount(int percentage) {
        priceType.festiveSeasonDiscount(percentage);
    }

    public void conveyThanks() {
        priceType.sayThanks();
    }
}
