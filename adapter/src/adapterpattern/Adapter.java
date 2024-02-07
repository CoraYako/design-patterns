package adapterpattern;

public class Adapter implements RectInterface {
    protected TriInterface triangle;

    public Adapter(TriInterface triangle) {
        this.triangle = triangle;
    }

    @Override
    public void aboutMe() {
        triangle.aboutTriangle();
    }

    @Override
    public double calculateArea() {
        return triangle.calculateTriangleArea();
    }
}
