package flyweightpattern;

class Bus implements Vehicle {
    private String description;

    public Bus(String description) {
        this.description = description;
    }

    @Override
    public void aboutMe(String color) {
        System.out.print(description + " with " + color + " color.");
    }
}
