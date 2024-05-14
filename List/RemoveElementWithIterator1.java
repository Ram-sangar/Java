import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveElementWithIterator1 {
	public static void main(String args[]){
		List<String> list = new ArrayList<>();
		list.add("Royal Enfield");
		list.add("Apache");
		list.add("KTM");
		list.add("Duke");
		
		System.out.println("List : "+list);
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasnext()){
			String Element = iterator.next();
			if(Element=="Duke"){
				iterator.remove();	
			}
		}
		System.out.println("After List : "+list);
	}
}