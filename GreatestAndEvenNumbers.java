// 9. Write a program in java to input any 20 number and display even number among them

import java.util.Scanner;

public class GreatestAndEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[20];
        int greatest;

        // Input 20 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Find greatest number
        greatest = numbers[0];
        for (int i = 1; i < 20; i++) {
            if (numbers[i] > greatest) {
                greatest = numbers[i];
            }
        }

        // Display the greatest number
        System.out.println("\nGreatest number = " + greatest);

        // Display even numbers
        System.out.println("Even numbers among them:");
        for (int i = 0; i < 20; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        sc.close();
    }
}
