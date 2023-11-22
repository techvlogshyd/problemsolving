package interview.wingify;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Write a program which validates if a given english statement is a valid mathematical expression.
For example "1 plus 2" is valid while "1 plus 2 minus" is not. Valid mathematical operators are plus, minus, multiply, division.
If it is a valid statement print true else print false

Your code must be able to print the sample output from the provided sample input.
However, your code is run against multiple hidden test cases.
Therefore, your code must pass these hidden test cases to solve the problem statement.


 */
public class ValidMathStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a mathematical expression: ");
        String input = scanner.nextLine();
        boolean isValid = isValidMathExpression(input);
        System.out.println(isValid);
    }

    private static boolean isValidMathExpression(String expression) {
        Set<String> validOperators = new HashSet<>(Arrays.asList("plus", "minus", "multiply", "division"));
        String[] words = expression.split("\\s+");

        if (words.length % 2 == 0) {
            for (int i = 0; i < words.length; i += 2) {
                if (!isValidNumber(words[i])) {
                    return false;
                }
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
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
