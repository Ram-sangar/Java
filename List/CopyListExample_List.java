import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

	public class CopyListExample_List{
		public static void main(String args[])
		{
			Scanner scanner = new Scanner (System.in);
			System.out.print("Enter the how many Numbers are you want in this list : ");
			int a = scanner.nextInt();
			List<Integer> Original_List = new ArrayList<>();
			
			System.out.println("Enter the List Values :");
			for(int i=0;i<a;i++){
			
				
				int b = scanner.nextInt();
				Original_List.add(b);
			}
			System.out.println(Original_List);
			List<Integer> New_List = new ArrayList<>(Original_List);
			System.out.println(New_List);
				
		}
	}