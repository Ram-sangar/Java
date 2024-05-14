import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class RemoveElementSet{
	public static void main(String args[]){
		Set<String> var = new TreeSet<>();
		var.add("Ram");
		var.add("Sangar");
		var.add("Hevin");
		var.add("Anisten");
		System.out.println(var);
		var.remove("Anisten");
		Set<String> var1 = new TreeSet<>();
		var1.add("Ram");
		var1.add("Siva");
		var1.add("Arul");
		var1.add("Cyril");
		System.out.println(var1);
		var.addAll(var1);
		//var.pollLast();
		Iterator<String> it = var.iterator();
		
		while (it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}