package practice.problems;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){

        int myFirstCheck = (int)(num1 * 1000);
        int mySecondCheck = (int)(num2 * 1000);
        System.out.println(myFirstCheck);
        System.out.println(mySecondCheck);
        if(myFirstCheck - mySecondCheck == 0){
            return true;
        } else
            return false;
        }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756,3.175789));
        System.out.println(areEqualByThreeDecimalPlaces(3.124,3.1245));
        System.out.println(areEqualByThreeDecimalPlaces(3.1249999,3.1245));
    }
}
