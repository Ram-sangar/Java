import java.util.Scanner;

public class Console_input{

	public static void main(String args[]){
	
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter username:");
		
		String Username=obj.nextLine();
		System.out.println("username is:"+Username);
	}
}