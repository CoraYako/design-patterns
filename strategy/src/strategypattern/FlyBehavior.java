package strategypattern;

public class FlyBehavior implements VehicleBehavior {
    @Override
    public void showDetail(Vehicle vehicle) {
        System.out.println("The " + vehicle.getVehicleType() + " can fly now.\n");
    }
}
