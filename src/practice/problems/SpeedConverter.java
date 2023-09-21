package practice.problems;

public class SpeedConverter {
    public static long toMilesPerHour(double kiloMetersPerHour){
        if (kiloMetersPerHour<0)
            return -1;
        else
            return Math.round((kiloMetersPerHour/1.609));
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour<0)
            System.out.println("Invalid Value");
        else {
            long miles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(10.5);
    }
}
