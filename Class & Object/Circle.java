import java.util.Scanner;

public class Circle{

	
	
		
	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter a Radius:");
		int R = scanner.nextInt();
		
	
	
		Circle obj = new Circle();
		Circle obj1 = new Circle();
		obj.area(R);
		obj1.area(20);
		
	}
	public void area(int r){
		
		double Area = 2*3.14*r;
		System.out.println("Area : "+Area);
	}
}