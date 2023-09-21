package practice.hackerrank.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubMatrixMaxSum {
    /*
    Find max sum of upper left 2*2 sum matrix by reversing any rows and columns

    119+114+56+125=414

    [[119, 83, 42, 112],
    [56, 125, 56, 49],
    [43, 101, 56, 15],
    [108, 114, 98, 62]]



    */
    public static void main(String[] args) {
//        Integer[] row1 = {119, 83, 42, 112};
//        Integer[] row2 = {56, 125, 56, 49};
//        Integer[] row3 = {43, 101, 56, 15};
//        Integer[] row4 = {108, 114, 98, 62};
        Integer[] row1 = {119, 83, 200, 112};
        Integer[] row2 = {56, 125, 56, 49};
        Integer[] row3 = {43, 101, 56, 15};
        Integer[] row4 = {108, 114, 98, 62};


        System.out.println(maxSumMatrix(Arrays.asList(Arrays.asList(row1), Arrays.asList(row2), Arrays.asList(row3), Arrays.asList(row4))));
    }

    private static int maxSumMatrix(List<List<Integer>> inputMatrix) {
        int result = 0;
        List<List<Integer>> matrix = new ArrayList<>(inputMatrix);
        for (List<Integer> row : matrix) {
            int rowStart = 0, rowEnd = matrix.get(matrix.size() - 1).size() - 1, rowLeftHalfSum = 0, rowRightHalfSum = 0;
            while (rowStart < rowEnd) {
                rowLeftHalfSum += row.get(rowStart);
                rowRightHalfSum += row.get(rowEnd);
                rowStart++;
                rowEnd--;
            }
            if (rowRightHalfSum > rowLeftHalfSum) {
                int rowEndIndex = row.size() - 1;
                for (int i = 0, j = rowEndIndex; i < j; i++, j--) {
                    int temp = row.get(i);
                    row.set(i, row.get(j));
                    row.set(j, temp);
                }
                System.out.println(row);
            }
        }
        System.out.println(matrix);
        for (int i = 0; i < matrix.size() - 1; i++) {
            int colTopHalfSum = 0, colBottomHalfSum = 0;
            int top = 0, bottom = matrix.size() - 1;
            while (top < bottom) {
                colTopHalfSum += matrix.get(top).get(i);
                colBottomHalfSum += matrix.get(bottom).get(i);
                top++;
                bottom--;
            }

            if (colBottomHalfSum > colTopHalfSum) {
                int rowEndIndex = matrix.size() - 1;
                for (int k = 0; k < rowEndIndex; k++) {
                    while (top < bottom) {
                        int temp = matrix.get(bottom).get(k);
                        matrix.get(bottom).set(k, matrix.get(bottom).get(k));
                        matrix.get(bottom).set(k, temp);
                        top++;
                        bottom--;
                    }
                }
                System.out.println(matrix);
            }
        }
        return result;
    }
}
