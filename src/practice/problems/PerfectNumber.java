package practice.problems;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if (number<1)
            return false;
        int counter=1,sum=0;
        while (counter<=number/2){
            if (number%counter==0)
            sum=sum+counter;
            counter++;
        }
        return sum==number;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
}
