package strategypattern;

/*
 * This class represents the context class in this example.
 * */
public class VehicleSupervisor {
    private VehicleBehavior behavior;

    public VehicleSupervisor(VehicleBehavior behavior) {
        this.behavior = behavior;
    }

    /*
     * You can use this method when you want
     * to change the "vehicle behavior" on the fly.
     * */
    public void setVehicleBehavior(VehicleBehavior behavior) {
        this.behavior = behavior;
    }

    /*
     * Delegates the behavior tto the object referenced by a vehicle.
     * */
    public void displayDetail(Vehicle vehicle) {
        behavior.showDetail(vehicle);
    }
}
