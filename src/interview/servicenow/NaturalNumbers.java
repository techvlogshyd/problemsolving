package interview.servicenow;

public class NaturalNumbers {
//    5. Write a program in Java to display n terms of natural numbers and their sum. Go to the editor
//    Test Data
//    Input the number: 2
//    Expected Output :
//    Input number:
//            2
//    The first n natural numbers are :
//            2
//            1
//            2
//    The Sum of Natural Number up to n terms:
//            23
    public static void main(String[] args) {
        naturalNumbersAndSum(7);
    }
    static void naturalNumbersAndSum(int num){
        int sum =0;
        for (int i = 1; i <= num; i++) {
            System.out.print(i+ " ");
            sum += i;
        }
        System.out.println();
        System.out.println(sum);
    }
}
