import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetIterator{
	public static void main(String args[]){
		Set<String> var = new TreeSet<>();
		var.add("Ram");
		var.add("Sangar");
		var.add("Hevin");
		var.add("Anisten");
		System.out.println(var);
		Iterator<String> it = var.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}