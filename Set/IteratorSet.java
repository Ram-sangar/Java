import java.util.HashSet;
import java.util.Iterator;
public class IteratorSet{
	public static void main(String args[]){
		HashSet<String> var = new HashSet<>();
		var.add("Ram");
		var.add("Sangar");
		var.add("Hevin");
		var.add("Anisten");
		System.out.println(var);
		Iterator<String> it = var.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}