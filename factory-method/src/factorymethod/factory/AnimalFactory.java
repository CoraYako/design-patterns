package factorymethod.factory;

import factorymethod.model.Animal;

public abstract class AnimalFactory {
    protected abstract Animal createAnimal();

    public void createAndDisplayAnimal() {
        Animal animal;
        animal = createAnimal();
        animal.displayBehavior();
    }
}
