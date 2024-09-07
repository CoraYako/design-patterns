package nullobjectpattern;

public class NullVehicle implements Vehicle {
    public static final NullVehicle instance = new NullVehicle();
    private int nullVehiclesInstances = 0;

    private NullVehicle() {
        nullVehiclesInstances++;
        System.out.print("A null vehicle object is created.");
    }

    @Override
    public void travel() {
        // do nothing
    }

    public static NullVehicle getInstance() {
        return instance;
    }

    public static int getInstances() {
        return instance.nullVehiclesInstances;
    }
}
