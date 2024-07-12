package strategypattern;

/*
* This class used to show the initial behavior of a vehicle.
* It cannot do anything special.
* */
public class InitialBehavior implements VehicleBehavior {
    @Override
    public void showDetail(Vehicle vehicle) {
        System.out.println("The " + vehicle.getVehicleType() + " is in born state.");
        System.out.println("It cannot do anything special.\n");
    }
}
