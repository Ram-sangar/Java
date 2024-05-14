import java.util.ArrayList;
import java.util.List;

public class ListContain {
    public static void main(String[] args) {
        ListContain listContain = new ListContain();
        listContain.checkExistence();
    }

    public void checkExistence() {
        // Create the original list
        List<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");

        // Create a list of elements to check for existence
        List<String> elementsToCheck = new ArrayList<>();
        elementsToCheck.add("Banana");
        elementsToCheck.add("Orange");

        // Check if all elements in elementsToCheck exist in the original list
        boolean containsAll = originalList.containsAll(elementsToCheck);

        // Display the result
        System.out.println("Original List: " + originalList);
        System.out.println("Elements to Check: " + elementsToCheck);
        System.out.println("All elements exist: " + containsAll);
    }
}
