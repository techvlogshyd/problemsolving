package practice.hackerrank.week1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        Set<Integer> numbers=new HashSet<>();
        int unique=0;
        for (int i = 0; i < a.size(); i++) {
            if(!numbers.contains(a.get(i))){
                numbers.add(a.get(i));
            }
            else {
                numbers.remove(a.get(i));
            }
        }
        int[] result=numbers.stream().mapToInt(Integer::intValue).toArray();
       return result[0];
    }

    public static void main(String[] args) {
//        Integer[] values = {0,0,1,2,1};
        Integer[] values = {4,9,95,93,57,4,57,93,9};
        System.out.println(lonelyinteger(Arrays.asList(values)));
    }
}
