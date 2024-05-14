import java.util.Scanner;

public class Reverse_no_while{

	public static void main(String args[]){
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=scanner.nextInt();
		
		int i = 1;
		while(a>=i)
		{
			System.out.println(a);
			a--;
		}
		scanner.close();
	}
}