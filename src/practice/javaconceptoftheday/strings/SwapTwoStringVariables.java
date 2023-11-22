package practice.javaconceptoftheday.strings;

public class SwapTwoStringVariables {
    public static void main(String[] args) {
        swapStrings("Prasanna", "Hyderabad");
    }
    static void swapStrings(String s1, String s2){
        s1 = s1 + s2;
        s2 = s1.substring(0,s1.length()-s2.length());
      //  s1 = s1.substring(s2.length());
        s1 = s1.substring(s2.length(),s1.length());
        System.out.println(s1);
        System.out.println(s2);
    }
}
