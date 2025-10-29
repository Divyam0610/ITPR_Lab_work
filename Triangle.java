// Q6.Write a program to input any three sides.check they form a triangle or not.If they form a triangle,then determine the type of triangle being formed

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three sides
        System.out.print("Enter first side: ");
        double a = sc.nextDouble();
        System.out.print("Enter second side: ");
        double b = sc.nextDouble();
        System.out.print("Enter third side: ");
        double c = sc.nextDouble();

        // Check if the sides form a triangle
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("The sides form a triangle.");

            // Determine the type of triangle
            if (a == b && b == c) {
                System.out.println("It is an Equilateral Triangle.");
            } else if (a == b || b == c || a == c) {
                System.out.println("It is an Isosceles Triangle.");
            } else {
                System.out.println("It is a Scalene Triangle.");
            }
        } else {
            System.out.println("The sides do NOT form a triangle.");
        }

        sc.close();
    }
}
