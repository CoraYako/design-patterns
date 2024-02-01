package builderpattern;

public interface Builder {
    void addBrandName();

    void buildBody();

    void insertWheels();

    // The following method is used to
    // retrieve the object that is constructed.
    Vehicle getVehicle();
}