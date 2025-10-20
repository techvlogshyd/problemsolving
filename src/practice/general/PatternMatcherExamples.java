package practice.general;

import java.util.regex.*;

public class PatternMatcherExamples {

    public static void main(String[] args) {
        findAllWords();
        extractNumbers();
        validateEmail();
        extractHtmlTags();
        splitByComma();
        replaceMultipleSpaces();
        findCapitalWords();
        extractKeyValuePairs();
    }

    // 1. Find all words
    private static void findAllWords() {
        System.out.println("\n--- Find All Words ---");
        String input = "Hello World 123 Java Regex!";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Word: " + matcher.group());
        }
    }

    // 2. Extract numbers
    private static void extractNumbers() {
        System.out.println("\n--- Extract Numbers ---");
        String input = "Order123 costs 450 dollars, ID=999";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Number: " + matcher.group());
        }
    }

    // 3. Email validation
    private static void validateEmail() {
        System.out.println("\n--- Email Validation ---");
        String input = "user.name@example.com";
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Matcher matcher = pattern.matcher(input);

        System.out.println("Valid email? " + matcher.matches());
    }

    // 4. Extract HTML tags
    private static void extractHtmlTags() {
        System.out.println("\n--- Extract HTML Tags ---");
        String input = "Hello <b>World</b> <i>Java</i>";
        Pattern pattern = Pattern.compile("<(.*?)>");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Tag: " + matcher.group(1));
        }
    }

    // 5. Split by comma (ignoring spaces)
    private static void splitByComma() {
        System.out.println("\n--- Split By Comma ---");
        String input = "Apple, Banana , Mango,Orange";
        Pattern pattern = Pattern.compile("\\s*,\\s*");
        String[] parts = pattern.split(input);

        for (String fruit : parts) {
            System.out.println("Fruit: " + fruit);
        }
    }

    // 6. Replace multiple spaces with single space
    private static void replaceMultipleSpaces() {
        System.out.println("\n--- Replace Multiple Spaces ---");
        String input = "Hello    World   Java";
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(input);

        String output = matcher.replaceAll(" ");
        System.out.println(output);
    }

    // 7. Find words starting with a capital letter
    private static void findCapitalWords() {
        System.out.println("\n--- Find Words Starting With Capital ---");
        String input = "Alice and Bob are learning Java Streams";
        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]*\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Name/Word: " + matcher.group());
        }
    }

    // 8. Extract key-value pairs
    private static void extractKeyValuePairs() {
        System.out.println("\n--- Extract Key-Value Pairs ---");
        String input = "id=101;name=Alice;role=Admin";
        Pattern pattern = Pattern.compile("(\\w+)=(\\w+)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Key: " + matcher.group(1) + ", Value: " + matcher.group(2));
        }
    }
}
