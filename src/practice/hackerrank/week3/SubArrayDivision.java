package practice.hackerrank.week3;

import java.util.Arrays;
import java.util.List;

public class SubArrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        int noOfWays=0;
        for (int i = 0; i <= s.size()-m; i++) {
            int sum=0;
            for (int j = i; j <i+m ; j++) {
                sum=sum+ s.get(j);
            }
            if(sum==d){
                noOfWays++;
            }
        }
        return noOfWays;

    }

    public static void main(String[] args) {
//        Integer[] values = {1,2,1,3,2};
//        Integer[] values = {1,1,1,1,1,1};
//        Integer[] values = {4};
        Integer[] values = {2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1};

//        System.out.println(birthday(Arrays.asList(values),3,2));
//        System.out.println(birthday(Arrays.asList(values),4,1));
        System.out.println(birthday(Arrays.asList(values),18,7));




    }

}
