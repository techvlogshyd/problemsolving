package interview.publicissapient;

public class StringCompressor {
    public static void main(String[] args) {
        String input = "EzzzzzzzaabbbccccAAD";

        String compressed = compressString(input);
        System.out.println("Compressed: " + compressed);
    }

    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char currentChar = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                compressed.append(currentChar);
                compressed.append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        // Add the last character(s)
        compressed.append(currentChar);
        compressed.append(count);
        return compressed.toString();
    }
}
