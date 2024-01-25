package abstractfactory;

import abstractfactory.pet.PetAnimalFactory;
import abstractfactory.wild.WildAnimalFactory;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        System.out.println("***Abstract Factory Pattern Demo.***\n");
        AnimalFactory animalFactory;
        // Making a wild dog and wild tiger through
        // WildAnimalFactory
        animalFactory = new WildAnimalFactory();
        Dog dog = animalFactory.createDog("brown");
        Tiger tiger = animalFactory.createTiger("withe");
        dog.displayMe();
        tiger.aboutMe();
        tiger.inviteDog(dog);

        System.out.println("\n************\n");
        // Making a pet dog and pet tiger through
        // PetAnimalFactory now
        animalFactory = new PetAnimalFactory();
        dog = animalFactory.createDog("black");
        tiger = animalFactory.createTiger("golden");
        dog.displayMe();
        tiger.aboutMe();
        tiger.inviteDog(dog);
    }
}