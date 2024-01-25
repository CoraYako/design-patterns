package abstractfactory.wild;

import abstractfactory.Dog;

class WildDog implements Dog {
    public WildDog(String color) {
        System.out.println("A wild dog with " + color + " color is created.");
    }

    @Override
    public void displayMe() {
        System.out.println("The " + this + " says: I prefer to roam freely in jungles.Bow - Wow.");
    }

    @Override
    public String toString() {
        return "wild dog";
    }
}
