// Q3. Write a program to find out factorial of the given number

import java.util.Scanner;

public class FactorialNumber {

 // Method to calculate factorial
 static int factorial(int n) {
     int fact = 1;
     for (int i = 1; i <= n; i++) {
         fact = fact * i; // multiply each number
     }
     return fact;
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Taking number from user
     System.out.print("Enter a number: ");
     int num = sc.nextInt();

     // Calling method
     int result = factorial(num);

     // Displaying factorial
     System.out.println("Factorial of " + num + " is: " + result);
     sc.close();
 }
}
