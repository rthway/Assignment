
/* 1. Write a program that reads a Fahrenheit degree in double, then converts it to Celsius and
displays the result on the console. The formula for the conversion is as follows:

celsius = Fahrenheit – 32 * 5 / 9
*/

import java.util.Scanner;

public class TempConvertor {
    public static void main(String[] args)
    {
        // read input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        // convert Fahrenheit to Celsius
        double c = (f - 32) * 5 / 9;

        // display the result
        System.out.printf("Temperature in Celsius is : %.2f", c);
    }
}

