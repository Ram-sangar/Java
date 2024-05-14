import java.util.Scanner;

public class Fibonacci_for{

	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
		int a = scanner.nextInt();
		int fibo1 = 0;
		int fibo2 = 1;
		
		System.out.println(fibo1);
		System.out.println(fibo2);
		for(int i=0;i<=a;i++){
		    int fibo3 = 0;
			fibo3 = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibo3;
			System.out.println(fibo3);
			
		}
	}
}
		