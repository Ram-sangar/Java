import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListofmapExample{
	public static void main(String args[]){
		List<Map<String, String>> listmap = new ArrayList<>();
		
		Map<String,String> map1 = new HashMap<>();
		map1.put("RAM","SANGAR");
		map1.put("Hevin","Anisten");
		listmap.add(map1);
		
		Map<String,String> map2 = new HashMap<>();
		map2.put("Cyril","Christopher");
		map2.put("Saran","Yogi");
		map2.put("Gill","Christ");
		listmap.add(map2);
		
		System.out.println(listmap);
		
		
		
	}
}