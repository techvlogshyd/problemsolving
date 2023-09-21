package practice.problems;

public class PrintNumbers {
    public static void main(String[] args) {
        printNumbers(5);
    }
    static void printNumbers(int range){
        if (range>0){
            printNumbers(range-1);
            System.out.println(range);
        }
    }
}
