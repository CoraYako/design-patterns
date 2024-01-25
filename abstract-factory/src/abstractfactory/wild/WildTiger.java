package abstractfactory.wild;

import abstractfactory.Dog;
import abstractfactory.Tiger;

class WildTiger implements Tiger {
    public WildTiger(String color) {
        System.out.println("A wild tiger with " + color + " color is created.");
    }

    @Override
    public void aboutMe() {
        System.out.println("The " + this + " says: I prefer hunting in jungles.Halum.");
    }

    @Override
    public void inviteDog(Dog dog) {
        System.out.println("The " + this + " says: I saw a " + dog + " in the jungle.");
    }

    @Override
    public String toString() {
        return "wild tiger";
    }
}
