package practice.problems;

public class AllFactors {
    public static void printFactors(int number){
        if (number<1)
            System.out.println("Invalid Value");
        else {
            int counter = 1;
            while (counter <= number) {
                if (number % counter == 0)
                    System.out.println(counter);
                counter++;
            }
        }
    }

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
}
