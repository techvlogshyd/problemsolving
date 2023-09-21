package practice.problems;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobytes){
        if (kilobytes<0)
            System.out.println("Invalid Value");
        else {
            int megaBytes = Math.round(kilobytes / 1024);
            int remainingKiloBytes = kilobytes - (megaBytes * 1024);
            System.out.println(kilobytes+" KB = "+megaBytes+" MB and "+remainingKiloBytes+" KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}
