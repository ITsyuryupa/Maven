
public class Cube implements Shape{
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    // Метод для вычисления объема куба
    public double getPerimeter() {
        return Math.pow(sideLength, 3);
    }

    // Метод для вычисления площади поверхности куба
    public double getArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}

