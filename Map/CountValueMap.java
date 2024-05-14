import java.util.Map;
import java.util.HashMap;
public class CountValueMap{
	public static void main(String args[]){
	
	Map<String,String> var = new HashMap<>();
	
	var.put("Ram","Sangar");
	var.put("Hevin","Anisten");
	var.put("Cyril","Christopher");
	var.put("Arul","Prakash");
	
	System.out.println(var);
	System.out.println(var.size());
	
	}
}