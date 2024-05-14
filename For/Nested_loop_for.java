import java.util.Scanner;

public class Nested_loop_for{

	public static void main(String args[]){
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = scanner.nextInt();
		
		for(int i=0;i<=a;i++){
			System.out.println("The First loop No: "+i);
			
			for(int j=0;j<=a;j++){
			System.out.println("The Second loop No: "+j);
			}
		}
	}
}