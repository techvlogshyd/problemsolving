package practice.problems;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInteger(56453));
        System.out.println(reverseInteger(1234));
        System.out.println(reverseInteger(87698));
        System.out.println(reverseInteger(12345));
    }
    public static int reverseInteger(int number){
        int integerReversed = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            integerReversed = integerReversed * 10 + remainder;
            number = number/10;
        }
        return integerReversed;
    }


}
