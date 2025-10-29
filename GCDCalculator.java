//Q2. Write a program to find out hcf of two number by useing recursion

//importing Scanner class for user input
import java.util.Scanner;
public class GCDCalculator {
	//method for calculating gcd
	public static int calculateGCD(int num1,int num2)
	{
		if(num2 == 0)
		{
			return num1;
		}
		else
		{
			int rem;//for storing remainder of num1 by num2
			while(num2 != 0)
			{
				rem = num1 % num2;
				num1 = num2;
				num2 = rem;
			}
			return num1;
		}
	}

	public static void main(String[] args) {
		int num1, num2; //to store numbers
		//Creating object of scanner class for user input
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		num1 = sc.nextInt();
		
		System.out.print("Enter second number : ");
		num2 = sc.nextInt();
		
		int hcf = calculateGCD(num1, num2); // calculating gcd
		System.out.println("HCF : "+hcf);
	}
}
