package practice.javaconceptoftheday.strings;

public class StringRotationOfOtherString {
    public static void main(String[] args) {
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";
        System.out.println(isRotation(s1, s2));
    }
    static boolean isRotation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        String s3 = s1 + s1;
        return s3.contains(s2);
    }
}
