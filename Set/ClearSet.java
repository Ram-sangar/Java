import java.util.HashSet;
public class ClearSet{
	public static void main(String args[]){
		HashSet<String> var = new HashSet<>();
		var.add("Ram");
		var.add("Sangar");
		var.add("Hevin");
		var.add("Anisten");
		System.out.println(var);
		var.clear();
		System.out.println(var);
	}
}