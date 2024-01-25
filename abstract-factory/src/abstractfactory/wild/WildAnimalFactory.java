package abstractfactory.wild;

import abstractfactory.AnimalFactory;
import abstractfactory.Dog;
import abstractfactory.Tiger;

public class WildAnimalFactory extends AnimalFactory {
    public WildAnimalFactory() {
        System.out.println("You opt for a wild animal factory.\n");
    }

    @Override
    public Tiger createTiger(String color) {
        return new WildTiger(color);
    }

    @Override
    public Dog createDog(String color) {
        return new WildDog(color);
    }
}
