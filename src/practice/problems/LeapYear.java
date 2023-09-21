package practice.problems;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year < 1 || year > 9999)
            isLeapYear = false;
        else {
            if ((year % 4) == 0) {
                if ((year % 100) == 0) {
                    if ((year % 400) == 0) {
                        isLeapYear = true;
                    } else
                        isLeapYear = false;
                } else
                    isLeapYear = true;
            } else
                isLeapYear = false;
        }
        return isLeapYear;
    }
    public static boolean isLeapYear2(int year) {
        boolean isLeapYear = false;
        if (year < 1 || year > 9999)
            isLeapYear = false;
        else {
            if ((year % 400 == 0)
                    || ((year % 4 == 0) && (year % 100 != 0)))
                isLeapYear=true;
            else
                isLeapYear=false;
        }
        return isLeapYear;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(1));
        System.out.println(isLeapYear(2));
        System.out.println(isLeapYear(3));
        System.out.println(isLeapYear(4));
        System.out.println(isLeapYear(8));
        System.out.println(isLeapYear2(2020));
        System.out.println(isLeapYear2(1800));
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(2021));
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(2019));
        System.out.println(isLeapYear(2022));
        System.out.println(isLeapYear(2018));

    }
}
