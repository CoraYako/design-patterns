package nullobjectpattern;

public class Bus implements Vehicle {
    private static int busInstances = 0;

    public Bus() {
        busInstances++;
    }

    @Override
    public void travel() {
        System.out.println("Let us travel on a bus.");
    }

    public static int getInstances() {
        return busInstances;
    }
}
