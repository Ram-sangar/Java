import java.util.*;

public class Reverse_String
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter the String : ");
		String a = scanner.next();
		
		int b = a.length();
		while(b>0)
		{
			System.out.print(a.charAt(b-1));
			b--;
		}
		
	}
}