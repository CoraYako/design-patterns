package prototypepattern;

public abstract class BasicCar implements Cloneable {
    public String modelName;
    public int basePrice = 0, onRoadPrice = 0;

    public String getModelname() {
        return modelName;
    }

    public void setModelname(String modelname) {
        this.modelName = modelname;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}
