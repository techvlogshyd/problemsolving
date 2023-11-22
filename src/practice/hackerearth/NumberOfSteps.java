package practice.hackerearth;


import java.util.Scanner;

public class NumberOfSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int ans = -1;
        // Initialize ans to -1
        // Find the minimum element in array a
        int minA = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minA = Math.min(minA, a[i]);
        }
        for (int x = minA; x >= 0; x--) {
            boolean ok = true;
            int currentAns = 0;
            for (int i = 0; i < n && ok; i++) {
                ok &= (x == a[i]) || (b[i] > 0 && x % b[i] == a[i] % b[i]);
                if (b[i] != 0) {
                    currentAns += (a[i] - x) / b[i];
                }
            }
            if (ok) {
                ans = currentAns;
                break;
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}
