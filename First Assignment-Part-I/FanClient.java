/* Assignment 4.1 part-2:
Write a client program to test the Fan class. In the client program, create a Fan object.
Assign maximum speed, radius 10, color yellow, and turn it on. Display the object by
invoking its toString object.
* */

public class FanClient {
    public static void main(String[] args) {
        // Create a Fan object
        Fan myFan = new Fan();

        // Set properties for the fan
        myFan.setSpeed(Fan.FAST); // Assign maximum speed
        myFan.setRadius(10.0);     // Set radius to 10
        myFan.setColor("yellow");  // Set color to yellow
        myFan.setOn(true);         // Turn the fan on

        // Display the fan object using toString
        System.out.println("Fan Properties:");
        System.out.println(myFan);
    }
}
