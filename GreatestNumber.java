/ /Q11. Write a program to create an array of 15 numbers and find out the greatest number among them in java

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[15];
        int greatest;

        // Input 15 numbers
        System.out.println("Enter 15 numbers:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Find greatest number
        greatest = numbers[0];
        for (int i = 1; i < 15; i++) {
            if (numbers[i] > greatest) {
                greatest = numbers[i];
            }
        }

        // Display result
        System.out.println("\nThe greatest number is: " + greatest);

        sc.close();
    }
}
