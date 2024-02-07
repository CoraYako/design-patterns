package adapterpattern;

public class Triangle implements TriInterface {
    double baseLength; // base
    double height; // height

    public Triangle(double length, double height) {
        this.baseLength = length;
        this.height = height;
    }

    @Override
    public double calculateTriangleArea() {
        return 0.5 * baseLength * height;
    }

    @Override
    public void aboutTriangle() {
        System.out.println("Shape type: Triangle.");
    }
}
