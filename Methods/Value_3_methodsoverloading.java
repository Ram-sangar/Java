import java.util.Scanner;

public class Value_3_methodsoverloading{

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a = scanner.nextInt();
		scanner.nextLine();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		System.out.println(add(a,b,c));
		
		System.out.println(add(a,b,c));
		
		System.out.println(add(10.55,1.11,3.45));
		
		System.out.println(add(20.55f,1.21f,3.45f));
		
	}
	/*public static short add(short d,short e,short f){
		
		short h = d + e + f;
		return h;
	}*/
	public static int add(int d,int e,int f){
		
		int h = d + e + f;
		return h;
	}
	public static double add(double d,double e,double f){
		
		double h = d + e + f;
		return h;
	}
	public static float add(float d,float e,float f){
		
		float h = d + e + f;
		return h;
	}
}