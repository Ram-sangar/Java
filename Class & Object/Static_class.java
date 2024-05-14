import java.util.Scanner;

public class Static_nonstatic
{
	static Scanner scanner = new Scanner (System.in);
	
	
	static String a=scanner.nextLine();
	public static void main(String args[])
	{
		
	}
	public static void fun()
	{
		System.out.println(a);
	}
	public void car()
	{
		String b=scanner.nextLine();
		System.out.println(b);
		fun();
	}

}