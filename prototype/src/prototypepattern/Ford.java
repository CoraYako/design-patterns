package prototypepattern;

import java.util.Random;

class Ford extends BasicCar {
    public Ford(String modelName) {
        this.modelName = modelName;
        // The base price for a Ford car
        basePrice = 40000;
        // Set the on-road price
        onRoadPrice = basePrice + (new Random()).nextInt(1000);
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }

    @Override
    public String toString() {
        return "Model: " + modelName + "\nPrice: " + onRoadPrice;
    }
}
