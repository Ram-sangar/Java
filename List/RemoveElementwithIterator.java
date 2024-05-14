import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveElementwithIterator{
	public static void main(String args[]){
	List<String> list = new ArrayList<>();
	list.add("Bmw");
	list.add("lamboghini");
	list.add("Audi");
	list.add("Rolls Royce");
	
	System.out.println(list);
	Iterator<String> iterator = list.iterator();
	while(iterator.hasNext()){
		String element = iterator.next();
		if(element.equals("lamboghini")){
			iterator.remove();
		}
	}
	System.out.println(list);
	}
}