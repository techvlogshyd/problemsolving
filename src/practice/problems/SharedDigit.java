package practice.problems;

public class SharedDigit {
    public static boolean hasSharedDigit(int number1,int number2){
        if(number1<10||number1>99||number2<10||number2>99)
            return false;
        int firstDigitOfFirstNumber=number1/10;
        int secondDigitOfFirstNumber=number1%10;
        int firstDigitOfSecondNumber=number2/10;
        int secondDigitOfSecondNumber=number2%10;
        return ((firstDigitOfFirstNumber==firstDigitOfSecondNumber)
                ||(secondDigitOfFirstNumber==firstDigitOfSecondNumber))
                ||((firstDigitOfFirstNumber==secondDigitOfSecondNumber)
                ||(secondDigitOfFirstNumber==secondDigitOfSecondNumber))
                ?true:false;

    }
    public static boolean hasSameLastDigit(int number1,int number2,int number3){
        if (!isValid(number1)||!isValid(number2)||!isValid(number3))
            return false;
        int lastDigitOfFirstNumber=number1%10;
        int lastDigitOfSecondNumber=number2%10;
        int lastDigitOfThirdNumber=number3%10;
        return (lastDigitOfFirstNumber==lastDigitOfSecondNumber)
                ||(lastDigitOfSecondNumber==lastDigitOfThirdNumber)
                ||(lastDigitOfFirstNumber==lastDigitOfThirdNumber)
                ?true:false;

    }
    public static boolean isValid(int number){
        if(number<10||number>1000)
            return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(10,99));
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }
}
