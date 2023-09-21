package practice.problems;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        long years;
        long days = 0;
        if(minutes<0)
            System.out.println("Invalid value");
        else {
            days = (minutes / 60) / 24;
            years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(7200);
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}
