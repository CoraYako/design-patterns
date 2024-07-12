package strategypattern;

public class FloatBehavior implements VehicleBehavior {
    @Override
    public void showDetail(Vehicle vehicle) {
        System.out.println("The " + vehicle.getVehicleType() + " can float now.\n");
    }
}
