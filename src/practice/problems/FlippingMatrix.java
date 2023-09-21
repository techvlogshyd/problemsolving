package practice.problems;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

/*
colsToConsider
 */
public class FlippingMatrix {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int sum=0,tempIndex = 0;
        int noOfRows=matrix.size();
        int noOfColumns=matrix.get(0).size();
        int rowsToConsider=noOfRows/2;
        int colsToConsider=noOfRows/2;

        for(int i=0;i<noOfRows;i++){
            int rowsSum1 = 0,rowsSum2 = 0;
            for (int j = 0; j <colsToConsider ; j++) {
                rowsSum1=rowsSum1+matrix.get(i).get(j);
                rowsSum2=rowsSum2+matrix.get(i).get(noOfRows-1-j);
            }
            if(rowsSum1<rowsSum2)
                Collections.reverse(matrix.get(i));
        }
        for(int i=0;i<noOfRows;i++){
            int colsSum1 = 0,colsSum2 = 0,temp=0,rowEnd=0,rowStart=0;
            for (int j = 0; j <colsToConsider ; j++) {
                colsSum1=colsSum1+matrix.get(j).get(i);
                colsSum2=colsSum2+matrix.get(noOfColumns-1-j).get(i);
                tempIndex=j;
            }
            if(colsSum1<colsSum2) {
                rowStart = matrix.get(i).get(noOfRows - 1 - i);
                rowEnd = matrix.get(tempIndex).get(i);
                matrix.get(i).set(i, rowEnd);
                matrix.get(i).set(noOfRows - 1 - i, rowStart);
            }
        }

//        for(int i=0;i<noOfRows;i++){
//
//            if(matrix.get(i).get(0)<matrix.get(i).get(noOfColumns-1))
//                Collections.reverse(matrix.get(i));
//        }
        System.out.println(matrix);
        for (int i = 0; i < rowsToConsider; i++) {
            for (int j = 0; j < colsToConsider; j++) {
                sum=sum+matrix.get(i).get(j);
                System.out.println(matrix.get(i).get(j));
            }
        }
        return sum;
    }
    public static int flippingMatrix2(List<List<Integer>> matrix) {
        // Write your code here
        int sum = 0;
        int size = matrix.size();
        for(int i=0;i<size/2;i++){
            for(int j=0;j<matrix.size()/2;j++){
                sum+=Math.max(matrix.get(i).get(j),
                        Math.max(matrix.get(i).get(size-1-j),
                                Math.max(matrix.get(size-1-i).get(j),
                                        matrix.get(size-1-i).get(size-1-j))));
            }
        }
        return sum;

    }



    public static void main(String[] args) {
        List<List<Integer>> input= asList(asList(119,83,42,112),asList(56,125,56,49),asList(43,101,56,15),asList(108,114,98,62));
//        List<List<Integer>> input= asList(asList(112,42,83,119),asList(56,125,56,49),asList(15,78,101,43),asList(63,98,114,106));
        System.out.println(flippingMatrix(input));
    }
}
