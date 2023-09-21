package practice.problems;

public class PrintCharacterOccurrence {
    /*
    2E5T10Q25H
    EETTTTTQQQQQQQQQHHHHHHHHHH
    A2E5T10Q25H
    AEETTTTTQQQQQQQQQHHHHHHHHHH
    2E5T10Q25H100
    EETTTTTQQQQQQQQQHHHHHHHHHH
    2E5TYHJU10Q25HT
    EETTTTTYHJUQQQQQQQQQHHHHHHHHHHT
    */
    public static void printCharOccurrence(String input){
        String result="";
        String noOfDigits="";
        for (int i = 0; i <input.length() ; i++) {
            if (Character.isDigit(input.charAt(i))){
                noOfDigits+=input.charAt(i);
            }
            else if (Character.isAlphabetic(input.charAt(i))){
                if (noOfDigits.isEmpty())
                    result += input.charAt(i);
                else {
                    for (int j = 0; j < Integer.parseInt(noOfDigits); j++) {
                        result += input.charAt(i);
                    }
                }
                noOfDigits="";
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        printCharOccurrence("2E5T10Q25H");
        printCharOccurrence("A2E5T10Q25H");
        printCharOccurrence("2E5T10Q25H100");
        printCharOccurrence("2E5TYHJU100Q25HT");
    }
}
