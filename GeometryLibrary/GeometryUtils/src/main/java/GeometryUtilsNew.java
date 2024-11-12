

public class GeometryUtilsNew {

    public static int compareAreas(Shape s1, Shape s2) {
        return Double.compare(s1.getArea(), s2.getArea());
    }

    public static int comparePerimeters(Shape s1, Shape s2) {
        return Double.compare(s1.getPerimeter(), s2.getPerimeter());
    }
}
