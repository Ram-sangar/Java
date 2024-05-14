import java.util.Map;
import java.util.HashMap;
public class CopyValueofMap{
	public static void main(String args[]){
	
	Map<String,String> var = new HashMap<>();
	
	var.put("Ram","Sangar");
	var.put("Hevin","Anisten");
	var.put("Cyril","Christopher");
	var.put("Arul","Prakash");
	
	Map<String,String> var1 = new HashMap<>(var);
	
	System.out.println(var1);
	System.out.println(var.size());
	
	}
}