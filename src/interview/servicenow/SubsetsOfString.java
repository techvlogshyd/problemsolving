package interview.servicenow;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfString {

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        String input = "ABCDEF";
        generateSubset(input, 0, 0, result);
        System.out.println(result);
        List<String> result2 = new ArrayList<>();
        String input2 = "ABCDEF";
        generateSubset(input2, result2);
        System.out.println(result2);
    }

    static void generateSubset(String input, int start, int end, List<String> result) {
        if (start == input.length()) {
            return;
        }

        if (end == input.length()) {
            generateSubset(input, start + 1, start + 1, result);
        } else {
            result.add(input.substring(start, end + 1));
            generateSubset(input, start, end + 1, result);
        }

    }
    static void generateSubset(String input, List<String> result) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                result.add(input.substring(i,j+1));
            }
        }
    }

}
