package practice.problems;

public class Febonacci {
    public static void main(String[] args) {
        int n=20;
        System.out.println(febonacci(n));
    }

    private static long febonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return febonacci(n-1)+febonacci(n-2);
    }
}
