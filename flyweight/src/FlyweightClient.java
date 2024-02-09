import flyweightpattern.Vehicle;
import flyweightpattern.VehicleFactory;

import java.util.Random;

public class FlyweightClient {
    public static void main(String[] args) throws Exception {
        System.out.println("***Flyweight Pattern Demo.***\n");
        VehicleFactory vehicleFactory = new VehicleFactory();
        // Making 3 cars
        createVehicles("car", 3, vehicleFactory);
        // Making 5 Buses
        createVehicles("bus", 5, vehicleFactory);
        // Making 2 future vehicles
        createVehicles("future", 2, vehicleFactory);
    }

    /**
     * We are trying to get the 5 vehicles.
     * Note that: we need not create additional
     * vehicles if we have already created one of these
     * categories.
     */
    private static void createVehicles(String vehicleType, int count, VehicleFactory factory) throws Exception {
        int distinctVehicles;
        for (int i = 0; i < count; i++) {
            Vehicle vehicle = factory.getVehicleFromFactory(vehicleType);
            vehicle.aboutMe(getRandomColor());
        }
        distinctVehicles = factory.totalObjectsCreated();
        System.out.println("\n\tDistinct vehicles in this application: " + distinctVehicles);
        System.out.println("------------");
    }

    /**
     * Get a random color. Here I consider
     * two colors only-red and green.
     */
    static String getRandomColor() {
        Random r = new Random();
        int random = r.nextInt();
        if (random % 2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}