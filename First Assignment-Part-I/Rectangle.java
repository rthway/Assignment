/* Asssignment 3 -part 1  :
Write a class named Rectangle to represent rectangles. The UML diagram for the
class is shown in Figure 4.1 Suppose that all the rectangles are the same colour. Use a
static variable for color
Write a client program to test the class Rectangle. In the client program, create two
Rectangle objects. Assign width 5 and height 50 each of the objects. Assign the color
yellow. Display the properties of both objects and their areas.
 */
public class Rectangle {
    // Static variable for color shared by all rectangles
    private static String color = "DefaultColor"; // You can set a default color

    // Instance variables
    private double length;
    private double width;

    // Constructors
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter and setter for color
    public static String getColor() {
        return color;
    }

    public static void setColor(String newColor) {
        color = newColor;
    }

    // Getter and setter for length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Getter and setter for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
