import java.util.Scanner;

public class Natural_no_for{

	public static void main(String args[]){
	
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int n=scanner.nextInt();
		System.out.println();
		
		for(int i=0;i<=n;i++){
			System.out.println(i);
		}
		scanner.close();
		
	}
}