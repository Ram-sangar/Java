public class CharIndexes{
    public static void main(String[] args) {
        // Sample string
        String inputString = "programming";

        // Character to find
        char targetChar = 'm';

        // Find the first index of the character
        int firstIndex = inputString.indexOf(targetChar);

        // Find the last index of the character
        int lastIndex = inputString.lastIndexOf(targetChar);

        // Display the results
        if (firstIndex != -1) {
            System.out.println("First index of '" + targetChar + "': " + firstIndex);
        } else {
            System.out.println("'" + targetChar + "' not found in the string.");
        }

        if (lastIndex != -1) {
            System.out.println("Last index of '" + targetChar + "': " + lastIndex);
        } else {
            System.out.println("'" + targetChar + "' not found in the string.");
        }
    }
}
