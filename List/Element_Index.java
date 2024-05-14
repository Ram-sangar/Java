import java.util.*;
class Element_Index{
	public static void main(String args[])
	{
		List<String> a = new ArrayList<>();
		a.add("Apple");
		a.add("Orange");
		a.add("Grapes");
		a.add("Pineapple");
		a.add("Watermelon");
		System.out.println("List : "+a);
		
		Scanner scanner = new Scanner(System.in);
		int size = a.size();
		System.out.println("Enter the number which element us you want to print:");
		int index = scanner.nextInt()-1;
		
		if(index>=0 && index<size)
		{
			String element = a.get(index);
			System.out.println("Element : "+element);
		}
		else{
			System.out.println("out of bound");
		}
			
		
	}
}