//Q4. Write a program to find out sum of first n natural numbers by creating a method


import java.util.Scanner;

public class SumNaturalNumbers {

 // Method to calculate sum of first n natural numbers
 static int findSum(int n) {
     int sum = 0;
     for (int i = 1; i <= n; i++) {
         sum = sum + i; // adding each number to sum
     }
     return sum;
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Taking input from user
     System.out.print("Enter the value of n: ");
     int n = sc.nextInt();

     // Calling method and displaying result
     int result = findSum(n);
     System.out.println("Sum of first " + n + " natural numbers is: " + result);
     sc.close();
}
     
}