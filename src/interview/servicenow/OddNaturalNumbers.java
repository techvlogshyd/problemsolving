package interview.servicenow;


//13. Write a program in Java to display the n terms of odd natural number and their sum
//        Input number of terms is: 5
//        Expected Output:
//        The odd numbers are:
//        1
//        3
//        5
//        7
//        9
//        The Sum of odd Natural Number upto 5 terms is: 25
public class OddNaturalNumbers {
    public static void main(String[] args) {
        oddNaturalNumbersAndSum(5);
    }
    static void oddNaturalNumbersAndSum(int num) {
        int sum = 0;
        int counter = 1;
        int i = 1;
        while (counter <= num) {
            if (i % 2 == 1) {
                sum += i;
                System.out.println(i);
                counter++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
