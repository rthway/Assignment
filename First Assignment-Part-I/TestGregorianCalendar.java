/*
5. Java API has the GregorianCalendar class in the java.util package that can be
used to obtain the year, month and day of a date. The no-arg constructor constructs an
instance for the current date and the methods get(GregorianCalendar.YEAR),
get(GregorianCalendar.MONTH), and get(GregorianCalendar.DAY)
return the year, month and day. Write a program to test this class to display the current
year, month and day.
* */
import java.util.GregorianCalendar;

public class TestGregorianCalendar {
    public static void main(String[] args) {
        // Create a GregorianCalendar instance for the current date
        GregorianCalendar calendar = new GregorianCalendar();

        // Get the current year, month, and day
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // Month is 0-based, so add 1
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        // Display the current year, month, and day
        System.out.println("Current Date:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
