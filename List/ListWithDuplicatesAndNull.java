import java.util.ArrayList;
import java.util.List;

public class ListWithDuplicatesAndNull {
    public static void main(String[] args) {
        ListWithDuplicatesAndNull example = new ListWithDuplicatesAndNull();
        example.storeAndPrintList();
    }

    public void storeAndPrintList() {
        // Create a List with duplicate and null values
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Apple"); // Duplicate
        myList.add(null);
        myList.add("Orange");
        myList.add(null); // Another null

        // Display the contents of the List
        System.out.println("List with Duplicates and Null Values: " + myList);

        // Get the hash code of the List
        int hashCode = myList.hashCode();

        // Display the hash code of the List
        System.out.println("Hash Code of the List: " + hashCode);
    }
}
