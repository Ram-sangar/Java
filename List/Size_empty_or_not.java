import java.util.ArrayList;
import java.util.List;

public class  Size_empty_or_not
{

	public static void main(String[] args){
	
		List<Integer> mylist = new ArrayList<>();
		
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		mylist.add(4);
		mylist.add(5);
		
		int listSize = mylist.size();
		
		boolean isEmpty = mylist.isEmpty();
		
		System.out.println("Size of the list : " + listSize);
		System.out.println("Is the list empty? " + isEmpty);
	}
}