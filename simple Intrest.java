
//Q7.  Program to calculate amount to be paid after charging simple interest 

import java.util.Scanner;//using Scanner class for user input   
public class AmountCalculator {
	//method for calculating simple interest
	public static float calculateSimpleInterest(float p,float r,int t)
	{
		//calculating simple interest
		float interest = (p * r * t)/100;	
		return interest;
	}
	/*-----------------------------------------------------*/
	//method to display principal, rate and time
	public static void displayData(float p,float r,int t)
	{
		//displaying data to the user
		System.out.println("Principal : Rs "+p);
		System.out.println("Rate : "+r+" %");
		System.out.println("Time : "+t+" year");
	}
	//----------------------------------------------
	public static void main(String[] args) {
		float principal,rate;
		int time;
		//creating the object of scanner class
		Scanner sc=new Scanner(System.in);
		//input of principal
		System.out.print("Enter principal(in Rs) : ");
		principal = sc.nextFloat();
		//input of rate
		System.out.print("Enter rate(in %) : ");
		rate = sc.nextFloat();
		//input of time
		System.out.print("Enter time(in year) :");
		time = sc.nextInt();
		System.out.println("----------------------------------");		
		//Displaying data to the user
		displayData(principal, rate, time);
		//calculating simple interest
		float si = calculateSimpleInterest(principal, rate, time);
		
		//calculating amount to be paid
		float amount = principal + si;
		
		System.out.println("Simple Interest : Rs "+si);
		System.out.println("Amount to be paid : Rs "+amount);		
	}
}
