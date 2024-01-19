//
//import java.util.Comparator;
//
//abstract class GeometricObject implements Comparable<GeometricObject> {
//    // abstract methods for area and perimeter
//    public abstract double getArea();
//    public abstract double getPerimeter();
//
//    @Override
//    public int compareTo(GeometricObject other) {
//        // Compare based on area
//        return Double.compare(this.getArea(), other.getArea());
//    }
//
//    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
//        // Use compareTo to find the larger object
//        return obj1.compareTo(obj2) > 0 ? obj1 : obj2;
//    }
//}
//
//class Circle extends GeometricObject {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//}
//
//class Cylinder extends GeometricObject {
//    private double radius;
//    private double height;
//
//    public Cylinder(double radius, double height) {
//        this.radius = radius;
//        this.height = height;
//    }
//
//    @Override
//    public double getArea() {
//        return 2 * Math.PI * radius * (radius + height);
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//}
//
//public class TestGeometricObject {
//    public static void main(String[] args) {
//        Circle circle1 = new Circle(5.0);
//        Circle circle2 = new Circle(7.5);
//
//        Cylinder cylinder1 = new Cylinder(3.0, 4.0);
//        Cylinder cylinder2 = new Cylinder(2.5, 5.0);
//
//        // Find the larger circle
//        Circle largerCircle = (Circle) GeometricObject.max(circle1, circle2);
//        System.out.println("Larger Circle: Radius = " + largerCircle.getRadius() + ", Area = " + largerCircle.getArea());
//
//        // Find the larger cylinder
//        Cylinder largerCylinder = (Cylinder) GeometricObject.max(cylinder1, cylinder2);
//        System.out.println("Larger Cylinder: Radius = " + largerCylinder.getRadius() +
//                ", Height = " + largerCylinder.getHeight() + ", Area = " + largerCylinder.getArea());
//    }
//}
//

