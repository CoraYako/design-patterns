import bridgepattern.ElectronicItem;
import bridgepattern.OnlinePrice;
import bridgepattern.ShowroomPrice;
import bridgepattern.Television;

public class BridgeClient {
    public static void main(String[] args) {
        System.out.println("***Bridge Pattern Demo.***");
        System.out.println("Verifying the market price of a television.");
        // Verifying online price
        ElectronicItem eItem = new Television(new OnlinePrice());
        eItem.showPriceDetails();
        //System.out.println("----------");
        // Verifying the offline/showroom price
        eItem = new Television(new ShowroomPrice());
        eItem.showPriceDetails();
    }
}