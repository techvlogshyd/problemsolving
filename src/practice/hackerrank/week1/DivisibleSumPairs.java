package practice.hackerrank.week1;

import java.util.HashMap;
import java.util.Map;

public class DivisibleSumPairs {
    static int divisibleSumPairs(int n, int k, int[] ar){
        int pairs=0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int value:ar) {
            int mod=value%k;
            int comp=k-mod==k?0:k-mod;  //required value in list
            if(map.containsKey(comp))
                pairs+=map.get(comp);

            if (map.containsKey(mod)) {
                map.put(mod, map.get(mod) + 1);
            }

            else if (!map.containsKey(mod)) {
                map.put(mod, 1);
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        System.out.println( divisibleSumPairs(5,5, new int[] { 10, 20, 30, 40 }));
        System.out.println( divisibleSumPairs(5,5, new int[] { 1, 2, 3, 4,5 }));
    }
}
