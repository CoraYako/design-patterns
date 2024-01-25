package simplefactory.factory;

import simplefactory.model.Animal;
import simplefactory.model.Dog;
import simplefactory.model.Tiger;

public class AnimalFactory {
    public Animal createAnimal(String animalType) {
        Animal animal;
        if (animalType.equals("dog")) {
            animal = new Dog();
        } else if (animalType.equals("tiger")) {
            animal = new Tiger();
        } else {
            System.out.println("You can create either a 'dog' or a 'tiger'. ");
            throw new IllegalArgumentException("Unknown animal cannot be instantiated.");
        }
        return animal;
    }
}
