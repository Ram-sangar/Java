import java.util.Scanner;

public class Arithmetric{

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter a value:");
		int a=obj.nextInt();
		
		System.out.println("Enter b value:");
		int b=obj.nextInt();
		
		int A = a + b;
		int S = a - b;
		int M = a * b;
		int D = a / b;
		int Mo = a % b;
		int incre = ++a;
		int decre = --b;
		System.out.println("Addition:"+(a+b));
		System.out.println("Subtraction:"+S);
		System.out.println("Multiplication:"+M);
		System.out.println("Division:"+D);
		System.out.println("Modulus:"+Mo);
		System.out.println("Incrementation:"+incre );
		System.out.println("Decrementation:"+decre );
		obj.close();
		
	}
}