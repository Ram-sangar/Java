import java.util.Scanner;

public class Arithmetric_methodsoverloading{

	public static void  main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int a = scanner.nextInt();
		
		System.out.print("Enter b number:");
		int b = scanner.nextInt();
		
		double i =10;
		double j =20;
		
		double H = add(i,j);
		System.out.println(H);
		
		int Sum = add(a,b);
		System.out.println(Sum);
		/*
		int Sub = sub(a,b);
		System.out.println(Sub);
		
		int Mul = mul(a,b);
		System.out.println(Mul);
		
		int Div = div(a,b);
		System.out.println(Div);
		
		int Mol = mol(a,b);
		System.out.println(Mol);
		*/
		scanner.close();
	}
	public static double add(double c,double d){
	
		double sum = c+d-c;
		return sum;
		
	}
	
	public static int add (int c,int d){
		
		int sum = c + d;
		return sum;
	}
	/*
	public static int sub (int c,int d){
		
		int b = c - d;
		return b;
	}
	
	public static int mul (int c,int d){
		
		int b = c * d;
		return b;
	}
	
	public static int div (int c,int d){
		
		int b = c / d;
		return b;
	}
	
	public static int mol (int c, int d){
		
		int b = c % d;
		return b;
	}*/
	
	
}