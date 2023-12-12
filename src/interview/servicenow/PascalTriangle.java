package interview.servicenow;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(printPascalTriangle(4));
        System.out.println(printPascalTriangle(5));
        System.out.println(printPascalTriangle(10));
    }

    static List<List<Integer>> printPascalTriangle(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j > 0 && i > 0 && j < res.get(i - 1).size()) {
                    row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                } else {
                    row.add(1);
                }
            }
            res.add(row);
        }

        return res;
    }

}
