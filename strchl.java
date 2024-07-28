import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class strchl {
    public static String longestWord(String sen) {
        // Remove punctuation using regular expressions
        String cleaned = sen.replaceAll("[^\\w\\s]", "");

        // Split the string into words
        String[] words = cleaned.split("\\s+");

        // Find the longest word
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(longestWord("Hello world123 567!")); // Output: "world123"
    }
}
