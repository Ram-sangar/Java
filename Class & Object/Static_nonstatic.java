import java.util.Scanner;

public class Static_nonstatic
{
	static Scanner scanner = new Scanner (System.in);
	
	static String a;
	
	public static void main(String args[])
	{
		System.out.println("Enter a person name:");
		a=scanner.nextLine();
		Static_nonstatic obj = new Static_nonstatic();
		obj.car();
	}
	public static void fun()
	{
		System.out.println(a);
	}
	public void car()
	{
		System.out.println("Enter a person car name:");
		String b=scanner.nextLine();
		System.out.println(b);
		fun();
	}

}