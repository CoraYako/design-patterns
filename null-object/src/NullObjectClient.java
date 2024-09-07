import nullobjectpattern.Bus;
import nullobjectpattern.NullVehicle;
import nullobjectpattern.Train;
import nullobjectpattern.Vehicle;

import java.util.Scanner;

public class NullObjectClient {
    public static void main(String[] args) {
        System.out.println("***The Null Object pattern demonstration.***\n");
        String input = null;
        Vehicle vehicle = null;
        boolean flag = true;
        int totalObjects = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            while (flag) {
                System.out.println("Enter your choice(Type 'b' for Bus, 't' for Train) ");
                input = scanner.next();
                switch (input.toLowerCase()) {
                    case "b":
                        vehicle = new Bus();
                        break;
                    case "t":
                        vehicle = new Train();
                        break;
                    case "exit":
                        flag = false;
                        System.out.println("Closing the application.");
                        break;
                    default:
                        System.out.println("Invalid input.");
                        vehicle = NullVehicle.getInstance();
                }
                // There is no need to do a null check
                vehicle.travel();
                totalObjects = Bus.getInstances() + Train.getInstances() + NullVehicle.getInstances();
                System.out.println("Number of objects created:" + totalObjects);
            }
        } finally {
            scanner.close();
        }
    }
}
