import java.util.Scanner;

public class Vehicle
{
	int wheel;
	String color;

	public static void main(String args[])
	{
		Vehicle obj = new Vehicle ();
		Vehicle obj1 = new Vehicle ();
		
		 
		
	    Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number of Wheels : ");
		obj.wheel = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Colour of vehicle : ");
		obj1.color = scanner.nextLine();
		
		int a = obj.wheel;
		String b = obj1.color;
			
		System.out.println("Selected Wheels : "+a);
		System.out.println("Selected Colour : "+b);
		
	}
}