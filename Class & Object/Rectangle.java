import java.util.Scanner;

public class Rectangle{

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("Enter a Width:");
		int w = scanner.nextInt();
		
		System.out.println("Enter a length:");
		int l = scanner.nextInt();
	
		area(w,l);
		Rectangle obj = new Rectangle();
		obj.perimeter(w,l);
		
	}
	public static void area(int a,int b){
		
		int Area = a * b;
		System.out.println("Area : "+Area);
		
	}
	public void perimeter (int a,int b){
		
		int Perimeter = ( a + b ) * 2;
		System.out.println("Perimeter : "+Perimeter);
		
	}
}