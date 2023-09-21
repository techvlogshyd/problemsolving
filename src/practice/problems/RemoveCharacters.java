package practice.problems;

public class RemoveCharacters {
    public static void main(String[] args) {

        String inputString = "GauravKukade";
        char ch = 'a';
        String result = removeCharacters(inputString, ch); // pass the inputString and char you want to remove

        System.out.println("After removing character '" + ch + "' from the inputString '" + inputString
                + "' the result will be: \n" + result);

    }

    // a method to remove any particular char from the string
    public static String removeCharacters(String str, char ch) {
        String result = str.replace(String.valueOf(ch), "");
        return result;
    }
}
