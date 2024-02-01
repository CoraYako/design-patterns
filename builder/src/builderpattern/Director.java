package builderpattern;

public abstract class Director {
    // Director knows how to use/instruct the
    // builder to create a vehicle.
    public abstract Vehicle instruct(Builder builder);
}
