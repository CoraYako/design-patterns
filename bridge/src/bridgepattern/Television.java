package bridgepattern;

public class Television extends ElectronicItem {
    private final String productType;
    private final double price;

    public Television(PriceType priceType) {
        super(priceType);
        this.productType = "Television";
        this.price = 2000;
    }

    @Override
    public void showPriceDetails() {
        priceType.displayProductPrice(productType, price);
    }
}
