package CoreJava;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int maxAge = Integer.MIN_VALUE; // To store the maximum age


        while (true) {
            System.out.println("Enter name and age separated by a comma (or press Enter to quit):");
            String input = scanner.nextLine();

            // Break the loop if the input is empty
            if (input.isEmpty()) {
                break;
            }

            // Split the input by comma
            String[] parts = input.split(",");

            // Extract the name and age
            String name = parts[0].trim();
            int age = Integer.parseInt(parts[1].trim());

            // Update the maximum age if necessary
            if (age > maxAge) {
                maxAge = age;
            }
        }

        // Print the age of the oldest person
        System.out.println("The age of the oldest person is: " + maxAge);
        scanner.close();


    }
}
