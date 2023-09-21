package practice.problems;

public class PrintPrimeNumbers {
    private static boolean isPrime(int number){
        if (number==1)
            return false;
//        for (int i=2;i<=number/2;i++){
        for (int i=2;i<=(long)Math.sqrt(number);i++){
            if (number%i==0)
                return false;
        }
        return true;
    }
    public static void printPrimeNumbers(int range){
        int count=0;
        for (int i = 3; i < range; i++) {
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
            if (count==10)
                break;
        }
    }

    public static void main(String[] args) {
        printPrimeNumbers(50);
    }
}
