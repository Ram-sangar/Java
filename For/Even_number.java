import java.util.Scanner;

public class Even_number{

	public static void main(String args[]){
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scanner.nextInt();
		int c=0;
		for(int i=0;i<=a;i+=2){
		    c += i;
		}
		System.out.println(c);
		scanner.close();
	}
}