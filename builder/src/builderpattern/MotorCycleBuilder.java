package builderpattern;

public class MotorCycleBuilder implements Builder {
    MotorCycle motorCycle;

    public MotorCycleBuilder() {
        motorCycle = new MotorCycle("Honda");
    }

    @Override
    public void addBrandName() {
        motorCycle.add(" Adding the brand name: " +
                motorCycle.brandName);
    }

    @Override
    public void buildBody() {
        motorCycle.add(" Making the body of the motorcycle.");
    }

    @Override
    public void insertWheels() {
        motorCycle.add(" 2 wheels are added to the motorcycle.");
    }

    @Override
    public Vehicle getVehicle() {
        return motorCycle;
    }
}
