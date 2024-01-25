package factorymethod;

import factorymethod.factory.AnimalFactory;
import factorymethod.factory.DogFactory;
import factorymethod.factory.TigerFactory;

public class FactoryMethodClient {
    public static void main(String[] args) {
        System.out.println("***Factory Method Pattern Demo.***");
        AnimalFactory factory;
        // Create a tiger and display its behavior
        // using TigerFactory.
        factory = new TigerFactory();
        factory.createAndDisplayAnimal();
        // Create a dog and display its behavior
        // using DogFactory.
        factory = new DogFactory();
        factory.createAndDisplayAnimal();
    }
}