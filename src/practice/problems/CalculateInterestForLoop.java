package practice.problems;

public class CalculateInterestForLoop {
    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }

    public static void main(String[] args) {
        for (int i=2;i<=8;i++){
            System.out.println(i+"% interest for amount 10000 is "+String.format("%.2f",calculateInterest(10000,i)));
        }
        for (int i=8;i>=2;i--){
            System.out.println(i+"% interest for amount 10000 is "+String.format("%.2f",calculateInterest(10000,i)));
        }
    }
}
