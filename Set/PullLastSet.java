import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.NavigableSet;
public class PullLastSet{
	public static void main(String args[]){
		NavigableSet<Integer> var = new TreeSet<>();
		var.add(16);
		var.add(5556);
		var.add(12);
		var.add(78);
		System.out.println(var);
		NavigableSet<Integer> var1 = new TreeSet<>();
		var1.add(514);
		var1.add(2583);
		var1.add(526);
		var1.add(6545);
		System.out.println(var1);
		var.addAll(var1);
		System.out.println(var);
		var.pollLast();
		Iterator<Integer> it = var.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}