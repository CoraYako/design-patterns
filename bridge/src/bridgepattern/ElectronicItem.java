package bridgepattern;

public abstract class ElectronicItem {
    protected PriceType priceType;

    public ElectronicItem(PriceType priceType) {
        this.priceType = priceType;
    }

    public abstract void showPriceDetails();
}
