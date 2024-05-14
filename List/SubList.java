import java.util.ArrayList;
import java.util.List;

public class 

{
    public static void main(String[] args) {
        SubListExample sublistExample = new SubListExample();
        sublistExample.createSubListAndDisplay();
    }

    public void createSubListAndDisplay() {
        // Create an original List
        List<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Orange");
        originalList.add("Grapes");

        // Create a new List from a set of elements in the original List
        List<String> subList = originalList.subList(1, 4); // Sublist from index 1 (inclusive) to index 4 (exclusive)

        // Display the original and new lists
        System.out.println("Original List: " + originalList);
        System.out.println("New List (Sublist): " + subList);
    }
}
