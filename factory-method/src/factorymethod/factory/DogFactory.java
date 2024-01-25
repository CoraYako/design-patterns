package factorymethod.factory;

import factorymethod.model.Animal;
import factorymethod.model.Dog;

public class DogFactory extends AnimalFactory {
    @Override
    protected Animal createAnimal() {
        return new Dog();
    }
}
