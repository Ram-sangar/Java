public class StringToStringBuffer {
    public static void main(String[] args) {
        // Original string
        String originalString = "Hello, World!";

        // Convert string to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(originalString);

        // Print the StringBuffer
        System.out.println("Original String: " + originalString);
        System.out.println("StringBuffer: " + stringBuffer);
    }
}