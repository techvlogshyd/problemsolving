package practice.problems;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(naturalNumberSum(5));
        System.out.println(naturalNumberSum2(5));
    }
    public static int naturalNumberSum(int n){
        if(n == 1){
            return 1;
        }
        return n + naturalNumberSum(n-1);
    }
    public static int naturalNumberSum2(int n){
       return n * (n+1)/2;
    }

}
