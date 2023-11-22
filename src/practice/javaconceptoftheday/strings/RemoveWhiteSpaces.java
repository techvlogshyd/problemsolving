package practice.javaconceptoftheday.strings;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("Enter input string to be cleaned from white spaces...!"));
        System.out.println(removeWhiteSpaces2("Enter input string to be cleaned from white spaces...!   !"));
    }
    static String removeWhiteSpaces(String input){
        return input.replace(" ", "");
    }
    static String removeWhiteSpaces2(String input){
        String withOutWhiteSpaces = "";
        for(char ch : input.toCharArray()){
            if(ch != ' '){
                withOutWhiteSpaces += ch;
            }
        }
        return withOutWhiteSpaces;
    }
}
