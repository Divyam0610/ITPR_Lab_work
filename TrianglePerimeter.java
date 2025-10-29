// Q8.Program to calculate area and perimeter of a triangle using float values, constructor, and method

import java.util.Scanner;

class Triangle {
    float side1, side2, side3;

    // Constructor
    Triangle(float s1, float s2, float s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    // Method to calculate area using Heron's formula
    float calculateArea() {
        float s = (side1 + side2 + side3) / 2;
        return (float) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to calculate perimeter
    float calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class TriangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        float s1 = sc.nextFloat();
        System.out.print("Enter second side: ");
        float s2 = sc.nextFloat();
        System.out.print("Enter third side: ");
        float s3 = sc.nextFloat();

        Triangle t = new Triangle(s1, s2, s3);

        System.out.println("Area of Triangle = " + t.calculateArea());
        System.out.println("Perimeter of Triangle = " + t.calculatePerimeter());

        sc.close();
    }
}
