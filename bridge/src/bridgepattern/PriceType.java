package bridgepattern;

public interface PriceType {
    void displayProductPrice(String productType, double price);
    void festiveSeasonDiscount(int percentage);
    void sayThanks();
}
