package practice.problems;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner=new Scanner(System.in);
       double counter=0,sum=0;
       long average=0;
        while(true){
            System.out.println("Enter number");
            boolean isInt=scanner.hasNextInt();
            if (isInt){
                counter++;
                int number=scanner.nextInt();
               sum+=number;
               average=(long)Math.round((sum/counter));
            }
            else{
                break;
            }
        }
        System.out.println("SUM = "+(int)sum+" AVG = "+average);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
