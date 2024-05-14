import java.util.*;

class  remove_elements_List_index_a_to_index_b
{
	public static void main(String args[])
	{
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
		
		//start
		System.out.println("Enter the Starting index");
		int start = scanner.nextInt();
		//end
		System.out.println("Enter the Ending index");
		int End = scanner.nextInt();
		int times = End-start;
		for(int i=0;i<=times;i++){
			
			arr.remove(start);
		}
		
		for(String l:arr){
		System.out.println(l);
		}
		
		
	}
}
