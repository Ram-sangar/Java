import java.util.function.Predicate;

public class CheckAlphabets {
    public static void main(String[] args) {
        String inputString = "AbCdEfG";

        // Lambda expression to check if each character is an alphabet
        Predicate<Character> isAlphabet = c -> Character.isLetter(c);

        // Use stream and allMatch to check if all characters are alphabets
        boolean result = inputString.chars().allMatch(c -> isAlphabet.test((char) c));

        // Output the result
        if (result) {
            System.out.println("The string contains only alphabets.");
        } else {
            System.out.println("The string contains non-alphabetic characters.");
        }
    }
}
