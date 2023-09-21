package practice.problems;

public class ReverseString {
    public static void stringReverseCharArray(String input){
        char[] inputChars=input.toCharArray();
        String result = "";
        for (int i = inputChars.length-1; i >= 0; i--) {
            result=result+inputChars[i];
        }
        System.out.println(result);
    }
    public static void stringReverseStringBuilder(String input){
       StringBuilder inputSB=new StringBuilder();
       inputSB.append(input);
        System.out.println(inputSB.reverse());
    }
    public static void stringReverseForLoop(String input) {
        String result = "";
        char ch;
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i); //extracts each character
            result = ch + result; //adds each character in front of the existing string
        }
        System.out.println(result);
    }
    public static String stringReverseRec(String input) {
        int length = input.length();
        if(input.length() <= 1)
            return input;
        String left = input.substring(0,length/2);
        String right = input.substring(length/2,length);
        return stringReverseRec(right)+stringReverseRec(left);
    }
    public static void main(String[] args) {
//        stringReverseCharArray("prasanna");
//        stringReverseStringBuilder("prasanna");
//        stringReverseForLoop("prasanna");
        System.out.println(stringReverseRec("I am Prasanna"));
    }
}
