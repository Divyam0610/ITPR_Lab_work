// Q10. Write a program to calculte curved surface area,total suface area ,volume of cylinder 
// import Scanner class
import java.util.Scanner;  

public class Cylinder {
    float radius, height;

    // Constructor
    Cylinder(float r, float h) {
        radius = r;
        height = h;
    }

    // Method to calculate Curved Surface Area
    float curvedSurfaceArea() {
        return 2 * 3.14f * radius * height;
    }

    // Method to calculate Total Surface Area
    float totalSurfaceArea() {
        return 2 * 3.14f * radius * (radius + height);
    }

    // Method to calculate Volume
    float volume() {
        return 3.14f * radius * radius * height;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of cylinder: ");
        float r = sc.nextFloat();

        System.out.print("Enter height of cylinder: ");
        float h = sc.nextFloat();

        Cylinder c = new Cylinder(r, h);

        System.out.println("Curved Surface Area = " + c.curvedSurfaceArea());
        System.out.println("Total Surface Area = " + c.totalSurfaceArea());
        System.out.println("Volume = " + c.volume());

        sc.close();
    }
}
