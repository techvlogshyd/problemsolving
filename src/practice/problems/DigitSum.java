package practice.problems;

public class DigitSum {
    public static int sumDigits(int number){
        int sum=0,digit=0,remainingDigits = 0;
        if(number<10)
            return -1;
        //number 123/10=12, 12/10=1, 1/12=0
        while(number>0){
            digit = number % 10;
            sum+=digit;
            number/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(-123));
        System.out.println(sumDigits(9999));
    }
}
