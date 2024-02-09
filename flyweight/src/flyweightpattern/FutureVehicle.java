package flyweightpattern;

class FutureVehicle implements Vehicle {
    private String description;

    public FutureVehicle(String description) {
        this.description = description;
    }

    // Client cannot choose color for FutureVehicle.
    // It is an unshared flyweight.
    // So, we ignore the client's input.
    @Override
    public void aboutMe(String color) {
        System.out.print(description + " with " + "a blue (default) color.");
    }
}
