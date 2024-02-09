package flyweightpattern;

class Car implements Vehicle {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    @Override
    public void aboutMe(String color) {
        System.out.print(description + " with " + color + " color.");
    }
}
