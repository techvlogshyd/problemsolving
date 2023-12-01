package interview.servicenow;


//10. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different"
//        if all three numbers are different and "Neither all are equal or different" otherwise.
//        Test Data
//        Input first number: 2564
//        Input second number: 3526
//        Input third number: 2456
//        Expected Output:
//        All numbers are different
public class ThreeNumberCheck {
    public static void main(String[] args) {
        numberCheck(2564, 3526, 2456);
    }
    static void numberCheck(int x, int y, int z){
        if(x == y && x == z){
            System.out.println("All numbers are equal");
        } else if (x == y || y == z || z == y) {
            System.out.println("Neither all are equal or different");
        }
        else {
            System.out.println("All numbers are different");
        }
    }
}
