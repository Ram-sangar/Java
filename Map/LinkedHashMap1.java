import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashMap1{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		Map<String,Integer> l = new LinkedHashMap<>();
		
		for(int i = 0; i<3;i++){
			System.out.println("Enter the Name");
			Integer a =scanner.nextInt();
			System.out.println("Enter the Number");
			String b =scanner.next();	
			l.put(a,b);
		}
		System.out.println("LinkedHashMap: " + l);
		
		scanner.close();
	}
}