import java.util.Scanner;

public class Factorial_for{

	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
		int a = scanner.nextInt();
		int fact = 1;
		
		for(int i=1;i<=a;i++){
			fact*=i;
		}
		System.out.print("Factorial : "+fact);
	}
}