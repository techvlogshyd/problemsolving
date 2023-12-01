package interview.servicenow;

//4. Write a Java program to check whether a given number is an ugly number. ugly numbers are positive numbers whose only prime
//        factors are 2, 3 or 5. First 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. By convention, 1 is included.
//        Test Data input an integer number 235
//        Expected Output:
//        It is not an ugly number.
public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(235));
        System.out.println(isUgly(6));
    }
    static boolean isUgly(int num){
        if(num < 0){
            return false;
        }
        for(int prime : new int[]{2, 3, 5}){
            while(num % prime == 0){
                num /= prime;
            }
        }
        return num == 1;
    }
}
