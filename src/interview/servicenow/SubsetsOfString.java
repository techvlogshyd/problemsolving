package interview.servicenow;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfString {

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        String input = "ABCDEF";
        generateSubset(input, "", 1, result);
        System.out.println(result);
    }

    static void generateSubset(String input, String subSet, int index, List<String> result) {
        result.add(subSet);

        for (int i = index; i < input.length(); i++) {
            generateSubset(input, subSet + input.charAt(i), i + 1, result);
        }

    }

}
