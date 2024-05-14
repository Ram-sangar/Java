import java.util.HashMap;
import java.util.Map;

public class ModifyMap {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> myMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        // Display the original map
        System.out.println("Original Map: " + myMap);

        // Modify the existing values of keys
        modifyValue(myMap, "two", 22);
        modifyValue(myMap, "four", 4); // This key doesn't exist, so a new entry will be added

        // Display the modified map
        System.out.println("Modified Map: " + myMap);
    }

    // Method to modify the value of a key in the map
    private static void modifyValue(Map<String, Integer> map, String key, int newValue) {
        if (map.containsKey(key)) {
            // Modify the existing value
            map.put(key, newValue);
            System.out.println("Value for key '" + key + "' modified to " + newValue);
        } else {
            // Add a new entry if the key doesn't exist
            map.put(key, newValue);
            System.out.println("New entry added for key '" + key + "' with value " + newValue);
        }
    }
}
