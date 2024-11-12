public class Triangle implements Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public double getArea() {
        double s = (sideA + sideB + sideC) / 2; // полупериметр
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }


    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Triangle: Area0 = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}

