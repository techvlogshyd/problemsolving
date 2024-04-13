package interview.servicenow.hackerrank;

/*
Different compression techniques are used in order to reduce the size of the messages sent over the web. An algorithm is designed to compress a given string by describing the total number of consecutive occurrences of each character next to it. For example, consider the string "abaasass". Group the consecutive occurrence of each character:
'a'occurs one time.
'b'occurs one time.
'a'occurs two times consecutively.
's'occurs one time.
'a'occurs one time.
's'occurs two times consecutively.
If a character only occurs once, it is added to the compressed string.
If it occurs consecutive times, the character is added to the string followed by an integer representing the number of consecutive occurrences. Thus the compressed form of the string is "aba2sas2".
 */
public class StringCompression {
    public static String compressedString(String message) {
        if (message == null || message.isEmpty()) {
            return message;
        }

        StringBuilder compressed = new StringBuilder();
        char prevChar = message.charAt(0);
        int count = 1;

        for (int i = 1; i < message.length(); i++) {
            char currChar = message.charAt(i);
            if (currChar == prevChar) {
                count++;
            } else {
                compressed.append(prevChar);
                if (count > 1) {
                    compressed.append(count);
                }
                prevChar = currChar;
                count = 1;
            }
        }

        compressed.append(prevChar);
        if (count > 1) {
            compressed.append(count);
        }

        return compressed.toString();
    }
    public static String compressedString2(String message) {
        if (message == null || message.isEmpty()) {
            return message;
        }

        StringBuilder compressed = new StringBuilder();
        int slow = 0;
        int fast = 0;
        int count = 1;

        while (fast < message.length()) {
            if (fast > 0 && message.charAt(fast) != message.charAt(fast - 1)) {
                compressed.append(message.charAt(fast - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
                slow = fast;
            } else {
                count++;
            }
            fast++;
        }

        // Append the last character
        compressed.append(message.charAt(slow));
        if (count > 1) {
            compressed.append(count);
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        String message = "abaasass";
        String compressedMessage = compressedString(message);
        System.out.println("Compressed message: " + compressedMessage); // Output: "aba2sas2"
        String compressedMessage2 = compressedString2(message);
        System.out.println("Compressed message: " + compressedMessage2); // Output: "aba2sas2"
    }
}
