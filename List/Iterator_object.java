import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_object{
	public static void main(String args[]){
		List<String> mylist = new ArrayList<>();
		mylist.add("Apple");
		mylist.add("Banana");
		mylist.add("Orange");
		
		Iterator<String> iterator = mylist.iterator();
		
		System.out.println("Iterator");
		while(iterator.hasNext()){
			String element = iterator.next();
			System.out.println(element);
		}
		
	}
}