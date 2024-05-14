import java.util.HashMap;
import java.util.Map;

public class ModifyMapValue {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> myMap = new HashMap<>();

        // Add some key-value pairs to the map
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        // Display the original map
        System.out.println("Original Map: " + myMap);

        // Modify the value for the key "two"
        String keyToModify = "two";
        int newValue = 22;

        if (myMap.containsKey(keyToModify)) {
            myMap.put(keyToModify, newValue);
            System.out.println("Map after modifying value for key '" + keyToModify + "': " + myMap);
        } else {
            System.out.println("Key '" + keyToModify + "' not found in the map.");
        }
    }
}
