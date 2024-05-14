/*import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateThroughMap {
    public static void main(String[] args) {
        // Creating a map
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 28);

        // Using Iterator to iterate through the map
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }
}*/

import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class IterateThroughMap{
	public static void main(String args[]){
		Map<String,Integer> map = new  TreeMap<>();
		map.put("RAM",100);
		map.put("Hevin",95);
		map.put("Cyril",90);
		map.put("Gill",85);
		map.put("A",0);
		
		System.out.println(map);
		Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()){
			Map.Entry<String,Integer> entry = iterator.next();
			System.out.println("Name: "+entry.getKey() + ",Age:" + entry.getValue());
		}
	}
}

/*import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class IterateThroughMap {
    public static void main(String args[]) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("RAM", 100);
        map.put("Hevin", 95);
        map.put("Cyril", 90);
        map.put("Gill", 85);
        map.put("A", 0);

        System.out.println(map);
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }
}
*/