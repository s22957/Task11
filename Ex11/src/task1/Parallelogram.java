package task1;

public final class Parallelogram implements Figure {

    private final double baseSide;
    private final double side;
    private final double height;

    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (baseSide + side);
    }

    @Override
    public double getArea() {
        return baseSide * height;
    }

    @Override
    public String getType() {
        return "Parallelogram";
    }
}