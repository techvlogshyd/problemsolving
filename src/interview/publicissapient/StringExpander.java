package interview.publicissapient;

public class StringExpander {
    public static void main(String[] args) {
        String input = "a2b3c4";
        String output = expandString(input);
        System.out.println("Output: " + output);
    }

    public static String expandString(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the next character is a digit
            if (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {
                int count = Character.getNumericValue(input.charAt(i + 1));
                for (int j = 0; j < count; j++) {
                    result.append(currentChar);
                }
                i++; // Skip the digit we just processed
            } else {
                // If no digit follows, append the character once
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
