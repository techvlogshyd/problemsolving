package practice.javaconceptoftheday.strings;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String input = "Java is java again java again";
        char c = 'a';
        System.out.println(charOccurrence(input, c));
    }
    static int charOccurrence(String input, char c){
        return input.length() - input.replace(""+c, "").length();
    }
}
