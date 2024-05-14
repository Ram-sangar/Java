import java.util.List;
import java.util.ArrayList;
class Forward_Backward{
	public static void main(String[] args){
		List<String> a = new ArrayList<>();
		
		a.add("Apple");
		a.add("Orange");
		a.add("Grapes");
		a.add("Pineapple");
		a.add("Watermelon");
		
		System.out.println("Original list: "+a);
		System.out.println("Forward the list :");
		
		for (String b:a)
		{
			System.out.println(b);
		}
		System.out.println("Backward the list :");
		int c =-a.size();
		int i =-1;
		while(i>=c){
			System.out.println(a.get(i));
			i--;
		}
		
	}
}