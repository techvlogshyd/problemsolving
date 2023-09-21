package practice.problems;

public class MethodOverloading {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        System.out.println("feet "+feet+" inches"+inches);
        if (feet >= 0 || (inches >= 0 && inches <= 12))
            return (double) (feet * 12 * 2.54) + (inches * 2.54);
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches >= 0) {
            int feet = inches / 12;
            int remainingInches = inches % 12;
            System.out.println("feet "+feet+" inches"+remainingInches);
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
        return -1;
    }
    public static String getDurationString(long minutes, long seconds) {
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            long hours = minutes / 60;
            long remainingMins=minutes%60;
           String hoursString=hours+"h";
           if (hours<10)
               hoursString="0"+hoursString;
            String minutesString=remainingMins+"m";
            if (remainingMins<10)
                minutesString="0"+minutesString;
            String secondsString=seconds+"s";
            if (seconds<10)
                secondsString="0"+secondsString;

            return hoursString+" "+minutesString+" "+secondsString;
        }
        return INVALID_VALUE_MESSAGE;
    }
    public static String getDurationString(long seconds) {
       if (seconds >= 0) {
            long mins=seconds/60;
            long remainingSeconds=seconds%60;
            return getDurationString(mins,remainingSeconds);
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(1,12));
        System.out.println(calcFeetAndInchesToCentimeters(41,8));
        System.out.println(calcFeetAndInchesToCentimeters(128));
        System.out.println(calcFeetAndInchesToCentimeters(500));
        System.out.println(getDurationString(65,7));
        System.out.println(getDurationString(3945L));

    }
}
