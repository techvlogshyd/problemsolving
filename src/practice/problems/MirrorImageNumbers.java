package practice.problems;
import java.util.Arrays;

public class MirrorImageNumbers {
    public static void checkMirrorImageNumber(int number){
        int multipliedNumber=number*2;
        char[] s1=String.valueOf(number).toCharArray();
        char[] s2=String.valueOf(multipliedNumber).toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        boolean mirrored=Arrays.equals(s1,s2);
        System.out.println(s1.toString()+","+s2.toString());
        if (mirrored)
            System.out.println("Mirrored");
        else
            System.out.println("Not mirrored");
    }

    public static void main(String[] args) {
        checkMirrorImageNumber(142857);
        checkMirrorImageNumber(142858);
    }
}
