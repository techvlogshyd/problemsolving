package practice.problems;

import java.util.ArrayList;
import java.util.List;

public class SubArraySum {

    public static void findSubArrays(int[] input, int expSum){
        int index=0;
        for (int i = 0; i < input.length; i++) {
            int sum=input[i];
            List<Integer> temp=new ArrayList<>();
            temp.add(input[i]);
            for (int j = i+1; j < input.length; j++) {
                temp.add(input[j]);
                sum+=input[j];
                if (sum==expSum){
                    System.out.println(temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] values = {1,1,1,1,-1};
//        System.out.println("Number of arrays"+findSubArrays(values,3));
    }
}
