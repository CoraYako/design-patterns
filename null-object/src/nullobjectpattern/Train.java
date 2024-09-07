package nullobjectpattern;

public class Train implements Vehicle {
    private static int trainInstances = 0;

    public Train() {
        trainInstances++;
    }

    @Override
    public void travel() {
        System.out.println("Let us travel on a bus.");
    }

    public static int getInstances() {
        return trainInstances;
    }
}
