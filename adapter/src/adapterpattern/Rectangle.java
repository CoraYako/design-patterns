package adapterpattern;

public class Rectangle implements RectInterface {
    double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void aboutMe() {
        System.out.println("Shape type: Rectangle.");
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
