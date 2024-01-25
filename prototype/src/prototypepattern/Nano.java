package prototypepattern;

import java.util.Random;

class Nano extends BasicCar {
    public Nano(String modelName) {
        this.modelName = modelName;
        // The base price for a Nano car
        basePrice = 5000;
        // Set the on-road price
        onRoadPrice = basePrice + (new Random()).nextInt(1000);
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Nano) super.clone();
    }

    @Override
    public String toString() {
        return "Model: " + modelName + "\nPrice: " + onRoadPrice;
    }
}
