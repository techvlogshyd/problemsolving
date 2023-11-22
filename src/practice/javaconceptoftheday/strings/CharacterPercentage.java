package practice.javaconceptoftheday.strings;

import java.text.DecimalFormat;

public class CharacterPercentage {
    public static void main(String[] args) {
        percentageCalculator("Tiger Runs @ The Speed Of 100 km/hour.");
    }
    static void percentageCalculator(String input){
        int totalChars = input.length();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;
        for (int i = 0; i < totalChars; i++) {
            char ch = input.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
            else {
                specialCharCount++;
            }
        }
        DecimalFormat formatter = new DecimalFormat("##.##");
        double upperPercentage = upperCaseCount*100.0/totalChars;
        double lowerPercentage = lowerCaseCount*100.0/totalChars;
        double digitPercentage = digitCount*100.0/totalChars;
        double specialPercentage = specialCharCount*100.0/totalChars;

        System.out.println("Upper case Percentage "+formatter.format(upperPercentage));
        System.out.println("Lower case Percentage "+formatter.format(lowerPercentage));
        System.out.println("Digit Percentage "+formatter.format(digitPercentage));
        System.out.println("Special Char Percentage "+formatter.format(specialPercentage));

    }
}
