import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class Get_Element_by_Index{
	public static void main(String args[]){
		
		ArrayList<String> arr = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of elements :");
		int a = scanner.nextInt();
		
		System.out.println("Enter the elements :");
		
		for (int i =0; i<a;i++)
		{
			String b = scanner.next();
			arr.add(b);
		}
		
		System.out.println("Enter the Index:");
		int c = scanner.nextInt();
		if(c>=0 && c<arr.size()){
		System.out.println("Element :"+arr.get(c));
		}
		else{
			System.out.println("Index out of bounds.");
		}
	}

}