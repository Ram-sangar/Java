import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RemoveMapFromList {
    public static void main(String[] args) {
        RemoveMapFromList remover = new RemoveMapFromList();
        remover.removeMapFromList();
    }

    public void removeMapFromList() {
        // Create a List of Maps
        List<Map<String, String>> listOfMaps = new ArrayList<>();

        // Add some Maps to the List
        Map<String, String> map1 = new HashMap<>();
        map1.put("name", "John");
        map1.put("age", "25");

        Map<String, String> map2 = new HashMap<>();
        map2.put("name", "Alice");
        map2.put("age", "30");

        Map<String, String> map3 = new HashMap<>();
        map3.put("name", "Bob");
        map3.put("age", "28");

        listOfMaps.add(map1);
        listOfMaps.add(map2);
        listOfMaps.add(map3);

        // Display the original List of Maps
        System.out.println("Original List of Maps: " + listOfMaps);

        // Create an Iterator to traverse the List
        Iterator<Map<String, String>> iterator = listOfMaps.iterator();

        // Search for the Map to remove
        while (iterator.hasNext()) {
            Map<String, String> currentMap = iterator.next();
            if ("Alice".equals(currentMap.get("name"))) {
                // Use Iterator's remove method to remove the Map from the List
                iterator.remove();
            }
        }

        // Display the List of Maps after removal
        System.out.println("List of Maps after removal: " + listOfMaps);
    }
}
