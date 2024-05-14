import java.util.*;
public class list{

	public static void main(String args[]){
		//create a list
		List<String> a=new ArrayList<String>();
		a.add("apple");
		a.add("mango");
		a.add("papaya");
		a.add("banana");
		a.add("grapes");
		
		for(String fruit:list){
			System.out.println(fruit);
		}
	}
}