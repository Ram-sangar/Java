import java.util.*;

public class ClearList {
	public static void main(String[] args){
		List<String> a = new ArrayList<>();
		
		a.add("Apple");
		a.add("Orange");
		a.add("Grapes");
		a.add("Pineapple");
		a.add("Watermelon");
		
		System.out.println("Original list: "+a);
		a.clear();
		
		System.out.println("New list: "+a);
		
	}
}