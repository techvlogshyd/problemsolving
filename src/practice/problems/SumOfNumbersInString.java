package practice.problems;

public class SumOfNumbersInString {

    public static int sumOfNumbers(String input){
        String noOfDigits="";
        int sum = 0;
        for (int i = 0; i <input.length() ; i++) {
            if (Character.isDigit(input.charAt(i))){
                noOfDigits+=input.charAt(i);
            }
            else if (Character.isAlphabetic(input.charAt(i))){
              sum+=Integer.parseInt(noOfDigits);
              noOfDigits="";
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbers("2E5T10Q250H"));
    }
}
