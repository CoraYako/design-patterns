package factorymethod.factory;

import factorymethod.model.Animal;
import factorymethod.model.Tiger;

public class TigerFactory extends AnimalFactory {
    @Override
    protected Animal createAnimal() {
        return new Tiger();
    }
}
