package bridgepattern;

public class OnlinePrice implements PriceType {
    @Override
    public void displayProductPrice(String productType, double price) {
        System.out.println("The " + productType + "'s online price is $" + price * .9);
    }
}
