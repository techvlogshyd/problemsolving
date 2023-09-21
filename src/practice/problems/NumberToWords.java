package practice.problems;

public class NumberToWords {
    public static void numberToWords(int number){
        if(number<0)
            System.out.println("Invalid value");
        else if (number == 0){
            System.out.println("Zero");
        }
        int remainder,reverse=reverse(number);
        while(reverse>0){
            remainder=reverse%10;
            reverse=reverse/10;
            switch (remainder){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("OTHER");
                    break;
            }
        }
        int numOfZeros = getDigitCount(number) - getDigitCount(reverse(number));
        for(int a=0;a<numOfZeros;a++){
            System.out.println("Zero");
        }
    }
    public static int reverse(int number){
        int reverse=0,remainder;
        while(number!=0){
            remainder=number%10;
            number=number/10;
            reverse=(reverse*10)+remainder;
        }
        return reverse;
    }
    public static int getDigitCount(int number){
        if (number<0)
            return -1;
        else if(number==0)
            return 1;
        int counter = 0;
        while(number!=0){
            counter++;
           number=number/10;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-121));
        System.out.println(reverse(-121));
        numberToWords(123);
        System.out.println(getDigitCount(456));
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(100));
        numberToWords(100);
    }
}
