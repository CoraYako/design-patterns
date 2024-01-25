package prototypepattern;

public class CarMaker {
    BasicCar nano, ford;

    public CarMaker() {
    }

    public BasicCar getNano() throws CloneNotSupportedException {
        if (nano == null) {
            //Create a Nano for the first time and return a clone it.
            nano = new Nano("Nano XM624 cc");
            return nano.clone();
        }
        return nano.clone();
    }

    public BasicCar getFord() throws CloneNotSupportedException {
        if (ford == null) {
            //Create a Ford for the first time and return a clone of it.
            ford = new Ford("Ford Aspire");
            return ford.clone();
        }
        return ford.clone();
    }
}
