/* Assignment 4.1 part- 1:
4. 1. Write a class named Fan to model fans. The properties, as shown in Figure 4.2, are
speed, on, radius, and color. You need to provide the accessor and mutator methods for
the properties, and the toString method for returning a string consisting of all the

values of all the properties in this class. Suppose the fan has three fixed speeds. Use
constants 1, 2, and 3 to denote slow, medium, and fast speed.
Write a client program to test the Fan class. In the client program, create a Fan object.
Assign maximum speed, radius 10, color yellow, and turn it on. Display the object by
invoking its toString object.
* */
public class Fan {
    // Constants for fan speeds
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Instance variables
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Constructors
    public Fan() {
        // Default values
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    // Accessor and mutator methods for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= SLOW && speed <= FAST) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed. Setting speed to SLOW.");
            this.speed = SLOW;
        }
    }

    // Accessor and mutator methods for on
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Accessor and mutator methods for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Accessor and mutator methods for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method to display all properties
    @Override
    public String toString() {
        return "Fan [speed=" + speed + ", on=" + on + ", radius=" + radius + ", color=" + color + "]";
    }
}
