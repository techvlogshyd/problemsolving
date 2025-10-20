package interview.servicenow;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(13));
        System.out.println(isPrime(4));
        System.out.println(isPrime(12345));
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(-7));

    }


    //7
    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for (int i = 2; i < num ; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    //2 3 5 7 13
    public static int nextPrime(int num){
        if(num < 2){
            num = 2;
        }
        for (int i = num + 1; i < Integer.MAX_VALUE ; i++) {
           if(isPrime(i))
               return i;
        }
        return -1;
    }

}

