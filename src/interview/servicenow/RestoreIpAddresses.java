package interview.servicenow;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses {



    public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() > 12 || s.length() < 4) {
            return res;
        }
        backtrack(s, 0, 0, "", res);
        return res;
    }

    private static void backtrack(String s, int index, int dots, String curIP, List<String> res) {
        if (dots == 4 && index == s.length()) {
            res.add(curIP.substring(0, curIP.length() - 1)); // Remove the last dot
            return;
        }

        if (dots > 4 || index >= s.length()) {
            return;
        }

        for (int j = index; j < Math.min(index + 3, s.length()); j++) {
            if (Integer.parseInt(s.substring(index, j + 1)) < 256 && (index == j || s.charAt(index) != '0')) {
                backtrack(s, j + 1, dots + 1, curIP + s.substring(index, j + 1) + ".", res);
            }
        }
    }

    public static List<String> generateIpAddress(String input) {
        List<String> result = new ArrayList<>();
        int n = input.length();

        for (int i = 1; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    String ip = generate(input, i, j, k);
                    if (!ip.isEmpty()) {
                        result.add(ip);
                    }
                }
            }
        }

        return result;
    }

    private static String generate(String input, int i, int j, int k) {
        String s1 = input.substring(0, i);
        String s2 = input.substring(i, j);
        String s3 = input.substring(j, k);
        String s4 = input.substring(k);

        if (check(s1) && check(s2) && check(s3) && check(s4)) {
            return s1 + "." + s2 + "." + s3 + "." + s4;
        }
        return "";
    }

    private static boolean check(String part) {
        int n = part.length();
        if (n < 1 || n > 3) {
            return false;
        }
        if (part.charAt(0) == '0' && n > 1) {
            return false;
        }
        int intPart = Integer.parseInt(part);
        return intPart >= 0 && intPart <= 255;
    }

    public static void main(String[] args) {
        System.out.println("ABCDEF".substring(0, 1));
        System.out.println("ABCDEF".substring(0,4));
        System.out.println("ABCDEF".substring(3));

        String s1 = "25525511135";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + restoreIpAddresses(s1));

        String s3 = "101023";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + restoreIpAddresses(s3));

        System.out.println("Output: " +generateIpAddress(s3));
    }
}
