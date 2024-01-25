import prototypepattern.BasicCar;
import prototypepattern.CarMaker;

public class PrototypeClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***Prototype Pattern Demo***\n");
        CarMaker carMaker = new CarMaker();
        // Working with a Nano car
        BasicCar nano = carMaker.getNano();
        System.out.println(nano);
        System.out.println("-------");
        // Getting a cloned version of Nano
        BasicCar clonedCar;
        clonedCar = nano.clone();
        // Working with the cloned Nano
        printCarDetail(clonedCar);
        System.out.println("-------\n");
        // Working with a Ford car copy
        BasicCar ford = carMaker.getFord();
        System.out.println(ford);
        System.out.println("-------");
        // Getting a cloned version of Ford
        clonedCar = ford.clone();
        // Working with the cloned Ford
        printCarDetail(clonedCar);
        System.out.println("-------\n");
    }

    private static void printCarDetail(BasicCar car) {
        System.out.println("Editing a cloned model:");
        System.out.println("Model: " + car.modelName);
        // Editing the on-Road price of a car
        // This is an optional step
        car.onRoadPrice += 100;
        System.out.println("It's on-road price: $" + car.onRoadPrice);
    }
}