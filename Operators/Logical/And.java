import java.util.Scanner;

public class And{

	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=scanner.nextInt();
		
		System.out.println("Enter b value");
		int b=scanner.nextInt();
		
		System.out.println("Enter c value");
		int c=scanner.nextInt();
		
		System.out.println("Enter d value");
		int d=scanner.nextInt();
		
		if(a>b && c<d){
			System.out.println("Statement is correct");
		}
	}
}