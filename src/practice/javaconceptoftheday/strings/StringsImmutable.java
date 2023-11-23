package practice.javaconceptoftheday.strings;

public class StringsImmutable {
    public static void main(String[] args) {
        String s1 = "Prasanna";
        String s2 = "Prasanna";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = new String("Prasanna");
        String s4 = new String("Prasanna");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        s1 = s1 + "Hyd";

        System.out.println(s1);
        System.out.println(s1 == s2);
    }

}
