package practice.hackerrank.week3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {
    public static int sockMerchant(List<Integer> ar) {
        Map<Integer,Integer> result=new HashMap<>();
        int pairs=0;
        for (int i = 0; i < ar.size(); i++) {
            if(!result.containsKey(ar.get(i))){
                result.put(ar.get(i), 1);
            }
            else {
                result.put(ar.get(i), result.get(ar.get(i)) + 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : result.entrySet()) {
            pairs+= (entry.getValue()/2);
        }
        return pairs;
    }
    public static void main(String[] args) {

        Integer[] values = {10,20,20,10,10,30,50,10,20};
        System.out.println(sockMerchant(Arrays.asList(values)));




    }
}
