/*
2. Write a program that reads an integer between 0 and 1000 and adds all the digits in the
integer. For example, if an integer is 943, the sum of all its digit is 16.
*/

import java.util.Scanner;

public class SumOfAllDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer between 0 and 1000
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = scanner.nextInt();

        // Validate the input
        if (number < 0 || number > 1000) {
            System.out.println("Please enter a valid integer between 0 and 1000.");
            return;
        }

        // Calculate the sum of digits
        int sum = calculateSumOfDigits(number);

        // Display the result
        System.out.println("The sum of digits in the entered integer is: " + sum);

        // Close the scanner
        scanner.close();
    }

    // Function to calculate the sum of digits in a number
    private static int calculateSumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            // Extract the last digit and add it to the sum
            sum += num % 10;

            // Remove the last digit
            num /= 10;
        }

        return sum;
    }
}

