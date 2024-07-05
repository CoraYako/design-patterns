package bridgepattern;

public class Television extends ElectronicItem {
    public Television(PriceType priceType) {
        super(priceType);
        this.productType = "Television";
        this.cost = 2000;
    }
}
