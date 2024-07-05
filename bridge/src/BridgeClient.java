import bridgepattern.*;

public class BridgeClient {
    public static void main(String[] args) {
        System.out.println("***Bridge Pattern Demo.***");
        System.out.println("Verifying the market price of a television.");
        // Verifying online price
        ElectronicItem electronicItem = new Television(new OnlinePrice());
        electronicItem.showPriceDetails();
        // Verifying the offline/showroom price
        electronicItem = new Television(new ShowroomPrice());
        electronicItem.showPriceDetails();
        electronicItem.getDiscount(7);
        electronicItem.conveyThanks();
        System.out.println("-------------------------------");
        System.out.println("Veryfying the market price of a DVD.");
        // Verifying the online price
        electronicItem = new DVD(new OnlinePrice());
        electronicItem.showPriceDetails();
        // Verifying the offline/showroom price
        electronicItem = new DVD(new ShowroomPrice());
        electronicItem.showPriceDetails();
        // Checking the DVD specific method
        ((DVD) electronicItem).getDoubleDiscountWithThanks();
    }
}