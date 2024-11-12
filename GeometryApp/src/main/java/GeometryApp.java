


public class GeometryApp {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);

        System.out.println(GeometryUtilsNew.compareAreas(circle, rectangle));
        Cube cube = new Cube(3);
        System.out.println(cube.getArea());

        Sphere sphere = new Sphere(10);
        System.out.println(sphere.getRadius());
    }
}

