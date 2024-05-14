import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CheckElementAndIndex_List{
		
		public static void main(String args[]){
			
			List<String> List = new ArrayList<>();
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the how many Numbers are you want in this list :");
			int a = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter the fruits name:");
			for(int i=0;i<a;i++){
				String b = scanner.nextLine();
				//System.out.println("b:"+b);
				List.add(b);
			}
			System.out.println(List);
			System.out.println("Enter a Fruit for index");
			String c =  scanner.next();
			if (List.contains(c)){
					
				int d = List.indexOf(c);
				System.out.println("The element "+ c + " exists in the list at index " + d);
			}
			else{
				System.out.println("The element "+ c + " not exists in the list at index");
			}
		}
}