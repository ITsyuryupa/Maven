
public class Sphere{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Метод для вычисления объема сферы
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Метод для вычисления площади поверхности сферы
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
