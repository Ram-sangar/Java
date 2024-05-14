import java.util.Scanner;

public class Natural_number{

	public static void main(String args[]){
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scanner.nextInt();
		int c=0;
		for(int i=1;i<=a;i++){
		    c += i;
		}
		System.out.println(c);
		scanner.close();
	}
}