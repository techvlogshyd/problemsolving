package practice.problems;

public class DiagonalStar {
    public static void printStar(int number){
        int left, right;
        if (number<5)
            System.out.println("Invalid Value");
        else{
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                  if (i==1||j==1||i==number||j==number||i==j||i+j==number+1)
                      System.out.print("*");
                  else
                      System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printStar(5);
        printStar(8);
        printStar(30);
    }
}
