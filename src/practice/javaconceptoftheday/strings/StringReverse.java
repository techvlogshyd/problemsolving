package practice.javaconceptoftheday.strings;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverseString("Prasanna"));
    }
    static String reverseString(String input){
        StringBuilder sb = new StringBuilder();
        for (int i = input.length()-1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }
}
