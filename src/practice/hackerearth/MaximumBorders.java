package practice.hackerearth;

import java.util.Scanner;

public class MaximumBorders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            // Consume the newline character
            String[] a = new String[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextLine();
            }
            int ans = 0;
            for (String line : a) {
                int cur = 0;
                for (char x : line.toCharArray()) {
                    if (x == '#') {
                        cur++;
                        ans = Math.max(ans, cur);
                    } else {
                        cur = 0;
                    }
                }
            }
            for (int j = 0; j < m; j++) {
                StringBuilder column = new StringBuilder();
                for (int k = 0; k < n; k++) {
                    column.append(a[k].charAt(j));
                }
                int cur = 0;
                for (char x : column.toString().toCharArray()) {
                    if (x == '#') {
                        cur++;
                        ans = Math.max(ans, cur);
                    } else {
                        cur = 0;
                    }
                }
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}
