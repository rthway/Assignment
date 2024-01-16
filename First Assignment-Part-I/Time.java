/*
6. Write a class called Time. The Time class contains data fields hour, minute and second
with their respective get methods. The no-arg constructor sets the hour, minute, and
second for the current time in GMT. The current time can be obtained using
System.currentTime(). Write a client program to test the Time class. In the client
program, create a Time object and display hour, minute and second using the get
methods.
* */
import java.util.TimeZone;

public class Time {
    private int hour;
    private int minute;
    private int second;

    // No-arg constructor sets the time for the current time in GMT
    public Time() {
        setTime(System.currentTimeMillis());
    }

    // Constructor that allows setting time using a specified elapsed time
    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    // Setter method to set the time using elapsed time
    public void setTime(long elapsedTime) {
        // Convert milliseconds to seconds
        long totalSeconds = elapsedTime / 1000;

        // Calculate current second
        second = (int) (totalSeconds % 60);

        // Calculate total minutes
        long totalMinutes = totalSeconds / 60;

        // Calculate current minute
        minute = (int) (totalMinutes % 60);

        // Calculate total hours
        long totalHours = totalMinutes / 60;

        // Calculate current hour (GMT)
        hour = (int) (totalHours % 24);
    }

    // Getter methods for hour, minute, and second
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Time object
        Time currentTime = new Time();

        // Display hour, minute, and second using get methods
        System.out.println("Current Time (GMT):");
        System.out.println("Hour: " + currentTime.getHour());
        System.out.println("Minute: " + currentTime.getMinute());
        System.out.println("Second: " + currentTime.getSecond());
    }
}
