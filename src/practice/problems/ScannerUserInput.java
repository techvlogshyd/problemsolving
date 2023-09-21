package practice.problems;

import java.util.Scanner;

public class ScannerUserInput {
    public static void main(String[] args) {
        System.out.println("Enter your no x to prints, where x represents count : ");
        Scanner scanner=new Scanner(System.in);
        boolean isValidNumber=scanner.hasNextInt();
        int numberOfInputs=scanner.nextInt();
        int counter=0,sum=0,order=1;
        if (isValidNumber){
            while (numberOfInputs>0) {
                System.out.println("Enter Number :"+order);
                boolean validInput=scanner.hasNextInt();
                if (validInput) {
                    int input=scanner.nextInt();
                    sum = sum + input;
                    counter++;
                }
                else{
                    System.out.println("Invalid number");
                }
                numberOfInputs--;
                order++;
                scanner.nextLine();
            }

            System.out.println("Total of all inputs : "+sum+" of valid count of numbers is "+counter);
        }
        else
            System.out.println("Invalid input");
        scanner.close();
    }
}
