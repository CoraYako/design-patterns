package builderpattern;

public class MotorCycleDirector extends Director {
    // The motorcycle director follows
    // its own sequence:
    // Add brand name-> make body-> insert wheels.
    public Vehicle instruct(Builder builder) {
        builder.addBrandName();
        builder.buildBody();
        builder.insertWheels();
        return builder.getVehicle();
    }
}
