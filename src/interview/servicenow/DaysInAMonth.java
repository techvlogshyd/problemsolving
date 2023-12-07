package interview.servicenow;


//14. Write a Java program to find the number of days in a month.
//        Input a month number: 2
//        Input a year: 2016
public class DaysInAMonth {
    public static void main(String[] args) {
        System.out.println(daysInaMonth(2,2016));
    }
    static int daysInaMonth(int month, int year){
        boolean isLeapYear = false;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            isLeapYear = true;
        }
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear ? 29 : 28;
            default:
                return -1; // Invalid month
        }

    }
}
