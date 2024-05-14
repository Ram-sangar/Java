import java.util.ArrayList;
import java.util.List;

public class InsertElementInMiddle {
    public static void main(String[] args) {
        InsertElementInMiddle inserter = new InsertElementInMiddle();
        inserter.insertInMiddleAndDisplay();
    }

    public void insertInMiddleAndDisplay() {
        // Create a List
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        // Display the original contents of the list
        System.out.println("Original List: " + stringList);

        // Insert an element ("Orange") in the middle of the list
        int middleIndex = stringList.size() / 2;
        stringList.add(middleIndex, "Orange");

        // Display the list after insertion
        System.out.println("List after inserting 'Orange' in the middle: " + stringList);
    }
}
