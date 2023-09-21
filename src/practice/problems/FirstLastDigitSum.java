package practice.problems;

public class FirstLastDigitSum
{
    public static int sumFirstAndLastDigit(int number){
      if(number<0)
          return -1;
       int first=0,last=0;
        last=number%10;
       while (number>=10){
            number=number/10;
        }
       return last+number;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1234));
        System.out.println(sumFirstAndLastDigit(-1234));
    }
}
