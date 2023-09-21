package practice.problems;

public class DropAlternativeOccurrenceOfChar {
    public static String dropAlternativeChar(String input){
        String result="";
        for (int i = 0; i <input.length() ; i++) {
            if(i<input.length()-1&&Character.toLowerCase(input.charAt(i))==Character.toLowerCase(input.charAt(i+1))) {
                result += input.charAt(i);
                i=i+1;
            }
            else{
                result+=input.charAt(i);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(dropAlternativeChar("PayPal SSEBBCCDDaAaAA"));
        //i/p- PayPal SSEBBCCDDaAaAA
        //o/p- PayPal SEBCDaaA
    }
}
