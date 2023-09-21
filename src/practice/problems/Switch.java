package practice.problems;

public class Switch {
    public static void checkChars(char ch){
        switch (ch){
            case 'A':
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C':
                System.out.println("Found C");
                break;
            case 'D':
                System.out.println("Found D");
                break;
            case 'E':
                System.out.println("Found E");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
    public static void checkMonth(String month){
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "march":
                System.out.println("Mar");
                break;
            default:
                System.out.println("Not sure");

        }
    }
    public static void printDayOfTheWeek(int day)
    {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }
    public static void printDayOfTheWeekIfElse(int day)
    {
        if(day==0)
        System.out.println("Sunday");
        else if(day==0)
        System.out.println("Monday");
        else if(day==1)
        System.out.println("Tuesday");
        else if(day==2)
        System.out.println("Wednesday");
        else if(day==3)
        System.out.println("Thursday");
        else if(day==4)
        System.out.println("Friday");
        else if(day==5)
        System.out.println("Saturday");
        else if(day==6)
        System.out.println("Invalid day");
        else
            System.out.println("Invalid day");
    }
    private static void printNumberInWord(int number){
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
    public static boolean isLeapYear(int year){
       if (year>=1&&year<=9999) {
           if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
               return true;
           else
               return false;
       }
       return false;
    }
    public static int getDaysInMonth(int month, int year){
       if((month>=1&&year>=1)&&(month<=12&&year<=9999)) {
           boolean isLeap = isLeapYear(year);
//           if (isLeap) {
               switch (month) {
                   case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                       return 31;
                   case 4: case 6: case 9: case 11:
                       return 30;
                   case 2:
                       if (isLeap)
                            return 29;
                       else
                            return 28;
                   default:
                       return -1;
               }
//           }
//           else {
//               switch (month) {
//                   case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//                       return 31;
//                   case 4: case 6: case 9: case 11:
//                       return 30;
//                   case 2:
//                       return 28;
//                   default:
//                       return -1;
//               }
//           }
       }
       else
           return -1;
    }

    public static void main(String[] args) {
        checkChars('A');
        checkChars('E');
        checkChars('a');
        checkChars('Z');
        checkMonth("March");
        checkMonth("Marchhh");
        printDayOfTheWeek(0);
        printDayOfTheWeek(100);
        printDayOfTheWeek(6);
        printDayOfTheWeekIfElse(0);
        printNumberInWord(1);
        System.out.println(isLeapYear(2020));
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));

    }
}
