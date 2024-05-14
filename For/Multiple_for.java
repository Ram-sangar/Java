import java.util.Scanner;

public class Multiple_for{

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the table number:");
		int a=scanner.nextInt();
		for (int i=1;i<=10;i++){
			System.out.println(i+"*"+a+"="+i*a);
		}
	
}
}