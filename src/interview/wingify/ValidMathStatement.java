package interview.wingify;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidMathStatement {
    public static void main(String[] args) {
        String input = "1 plus 2 minus"; // Replace with the statement you want to check
        boolean isValid = isValidMathExpression(input);
        System.out.println(isValid);
    }

    private static boolean isValidMathExpression(String expression) {
        // Define valid operators
        Set<String> validOperators = new HashSet<>(Arrays.asList("plus", "minus", "multiply", "division"));

        // Split the expression into words
        String[] words = expression.split("\\s+");

        // Check if the expression is valid
        if (words.length % 2 == 1) {
            // Even number of words should be present for a valid expression
            for (int i = 0; i < words.length; i += 2) {
                // Check if the even-indexed words are valid numbers
                if (!isValidNumber(words[i])) {
                    return false;
                }

                // Check if the odd-indexed words are valid operators
                if (i + 1 < words.length && !validOperators.contains(words[i + 1])) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    private static boolean isValidNumber(String str) {
        try {
            // Attempt to parse the string as a number
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
