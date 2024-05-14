import java.util.Scanner;

public class Reverse_no_for{

	public static void main(String args[]){
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=scanner.nextInt();
		
		for(int i=a;i<=1;i--){
			System.out.println(i);
		}
	}
}