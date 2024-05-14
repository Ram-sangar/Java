import java.util.Scanner;

public class Static_class
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner (System.in);
		static String a = scanner.nextLine();
		fun();
	}
	public static void fun();
	{
		System.out.println(a);
	}
}