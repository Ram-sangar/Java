import java.util.Scanner;

public class Break_for{

	public static void main(String args[]){
	    Scanner scanner = new Scanner (System.in);
		int a = scanner.nextInt();
		for (int i=0 ; i<a ; i+=2){
			if(i==10){
				
				break;
			}System.out.println(i);
		}
	}
}