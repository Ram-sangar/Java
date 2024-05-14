import java.util.HashMap;
import java.util.Map;

public class DeleteMapEntry {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> myMap = new HashMap<>();

        // Add some key-value pairs to the map
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        // Display the original map
        System.out.println("Original Map: " + myMap);

        // Delete the entry with key "two"
        String keyToDelete = "two";

        if (myMap.containsKey(keyToDelete)) {
            myMap.remove(keyToDelete);
            System.out.println("Map after deleting entry with key '" + keyToDelete + "': " + myMap);
        } else {
            System.out.println("Key '" + keyToDelete + "' not found in the map.");
        }
    }
}
