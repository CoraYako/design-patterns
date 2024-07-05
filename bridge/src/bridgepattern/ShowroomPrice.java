package bridgepattern;

public class ShowroomPrice implements PriceType {
    @Override
    public void displayProductPrice(String productType, double price) {
        System.out.println("The " + productType + "'s showroom price is $" + price);
    }

    @Override
    public void festiveSeasonDiscount(int percentage) {
        System.out.println("You can get a maximum of " +
                percentage + "% discount in festive season.");
    }

    @Override
    public void sayThanks() {
        System.out.println("Thank you for your interest in our product.");
    }
}
