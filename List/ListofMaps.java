import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class ListofMaps{
	public static void main(String args[]){
		List<Map<String,String>> listmap = new ArrayList<>();
		
		Map<String,String> map1 = new HashMap<>();
		map1.put("RAM","SANGAR");
		map1.put("Hevin","Anisten");
		map1.put("Cyril","Christopher");
		listmap.add(map1);
		
		Map<String,String> map2 = new HashMap<>();
		map2.put("RAM","SANGAR1");
		map2.put("Hevin","Anisten1");
		map2.put("Cyril","Christopher1");	
		map1.put("Cyril","Christopher1");
		listmap.add(map2);
	
		for(Map<String,String> map:listmap){
			System.out.println(map);
		}
		
	}
	}
