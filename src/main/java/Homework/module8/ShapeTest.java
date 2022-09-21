package Homework.module8;

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println(circle.getName());
        Shape triangle = new Triangle();
        System.out.println(triangle.getName());
        Shape quad = new Quad();
        System.out.println(quad.getName());
        Shape rectangle = new Rectangle();
        System.out.println(rectangle.getName());
        Shape octagon = new Octagon();
        System.out.println(octagon.getName());
        ShapeDetected shapeDetected = new ShapeDetected();
        shapeDetected.shapeDetected(triangle);
    }
}
