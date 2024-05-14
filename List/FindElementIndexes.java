import java.util.ArrayList;
import java.util.List;

public class FindElementIndexes {
    public static void main(String[] args) {
        FindElementIndexes finder = new FindElementIndexes();
        finder.findAndDisplayIndexes();
    }

    public void findAndDisplayIndexes() {
        // Create a List
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Banana");
        stringList.add("Apple");

        // Element to find
        String targetElement = "Banana";

        // Find all indexes of the target element in forward order
        List<Integer> forwardIndexes = findIndexes(stringList, targetElement, true);

        // Find all indexes of the target element in reverse order
        List<Integer> reverseIndexes = findIndexes(stringList, targetElement, false);

        // Display the results
        System.out.println("Original List: " + stringList);
        System.out.println("Indexes of '" + targetElement + "' in forward order: " + forwardIndexes);
        System.out.println("Indexes of '" + targetElement + "' in reverse order: " + reverseIndexes);
    }

    private List<Integer> findIndexes(List<String> list, String target, boolean forwardOrder) {
        List<Integer> indexes = new ArrayList<>();

        if (forwardOrder) {
            // Find indexes in forward order
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(target)) {
                    indexes.add(i);
                }
            }
        } else {
            // Find indexes in reverse order
            for (int i = list.size() - 1; i >= 0; i--) {
                if (list.get(i).equals(target)) {
                    indexes.add(i);
                }
            }
        }

        return indexes;
    }
}
