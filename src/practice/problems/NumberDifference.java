package practice.problems;

import java.util.Arrays;

public class NumberDifference {
    public static boolean solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        if(A.length<2){
            return false;
        }
        else{
            for(int i=0;i<A.length-1;i++){
                if(A[i]-A[i+1]==1||A[i]-A[i+1]==-1){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
int[] input ={11, 1, 8, 12, 14};
        System.out.println(solution(input));
    }
}
