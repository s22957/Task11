package task1;

public final class Rectangle implements Figure {

    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}
