package bridgepattern;

public class DVD extends ElectronicItem {
    public DVD(PriceType priceType) {
        super(priceType);
        this.productType = "DVD Player";
        this.cost = 1400;
    }

    public void getDoubleDiscountWithThanks() {
        getDiscount(10);
        getDiscount(5);
        conveyThanks();
    }
}
