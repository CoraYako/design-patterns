package builderpattern;

import java.util.LinkedList;

public abstract class Vehicle {
    private LinkedList<String> parts;

    public Vehicle() {
        parts = new LinkedList<String>();
    }

    public void add(String part) {
        // Adding parts
        parts.addLast(part);
    }

    public void showProduct() {
        System.out.println("These are the construction sequences:");
        for (String part : parts)
            System.out.println(part);
    }
}
