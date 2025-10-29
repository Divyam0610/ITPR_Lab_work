// Q1. Write a program to find out area and perimeter of rectangle.(also validate the data whenever required)
import java.util.Scanner;
/*---- defining a class for rectangle ----*/
class Rectangle
{
	//member variable
	private float length,breadth;
	//paramterized Constructor
	public Rectangle(float l,float b)
	{
		length = l;//initializing length
		breadth = b; //initializing breadth
	}
	//method for displaying data
	public void displaData()
	{
		System.out.println("----------------------------------------------");
		System.out.println("-------- Rectangle -------");
		System.out.println("Length : "+length+" cm");
		System.out.println("Breadth : "+breadth+" cm");
		calculatePerimeter(); // calculating perimeter
		calculateArea();//calculating area
	}
	//method for calculating area
	private void calculateArea()
	{
		float area = length * breadth;
		System.out.println("Area : "+area+" sq.cm");
	}
	//method for calculating perimeter
	private void calculatePerimeter()
	{
		float perimeter = 2 * (length + breadth);		
		System.out.println("Perimeter : "+perimeter+" cm");
	}
}
/*------------- Initial class ---------------------*/
public class RectangleOperation {

	public static void main(String[] args) {
		//creating object of Rectangle class
		Rectangle rect = new Rectangle(10.f,20.0f);
		//rect.inputData();
		rect.displaData();
	}
}
