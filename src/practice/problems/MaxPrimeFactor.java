package practice.problems;

public class MaxPrimeFactor {
    public static int getLargestPrime(int number) {
        if (number < 2)
            return -1;
        int maxPrime = -1;
        while (number % 2 == 0) {
            maxPrime = 2;
            number = number / 2;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                maxPrime = i;
                number = number / i;
            }
        }
        if (number > 2)
            maxPrime = number;
        return maxPrime;
    }
    public static int getLargestPrime2(int number) {
        if (number < 2)
            return -1;
        for (int i = 2; i <=Math.sqrt(number) ; i++) {
            while(number%i==0)
            {
                number=number/i;
            }
        }
        if (number==1)
            return 2;
        return number;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(2));
        System.out.println(getLargestPrime2(45));
        System.out.println(getLargestPrime2(217));
        System.out.println(getLargestPrime2(2));
        System.out.println(getLargestPrime(46));
        System.out.println(getLargestPrime2(46));
        System.out.println(getLargestPrime(16));
        System.out.println(getLargestPrime2(16));

    }
}
