import simplefactory.factory.AnimalFactory;
import simplefactory.model.Animal;

public class SimpleFactoryClient {
    public static void main(String[] args) {
        System.out.println("*** Simple Factory Demonstration.***");
        AnimalFactory factory = new AnimalFactory();

        Animal animal = factory.createAnimal("dog");
        animal.displayBehavior();

        animal = factory.createAnimal("tiger");
        animal.displayBehavior();
    }
}