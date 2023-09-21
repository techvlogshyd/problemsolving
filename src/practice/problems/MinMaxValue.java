package practice.problems;

import java.util.Scanner;

public class MinMaxValue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        while(true){
            System.out.println("Enter number");
            boolean isInt=scanner.hasNextInt();
            if (isInt){
                int number=scanner.nextInt();
                if (number<min)
                    min=number;
                else if (number>max)
                    max=number;
            }
            else{
                break;
            }
        }
        System.out.println("Min "+min+" Max "+max);
    }
}
