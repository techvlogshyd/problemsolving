package practice.neetcode.arraysandhashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public static void main(String[] args) {
        for (int num:topKFrequent(new int[]{1,1,1,2,2,3},2)) {
            System.out.println(num);
        }
        for (int num:topKFrequent(new int[]{1,2,3,4,5,6},5)) {
            System.out.println(num);
        }

    }
    public static int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> bucket[] = new ArrayList[nums.length + 1];

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        for (int key : count.keySet()){
            int freq = count.get(key);
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }

        int index = 0;
        int[] res = new int[k];
        for (int i = nums.length; i >= 0; i--)
            if (bucket[i] != null)
                for (int val : bucket[i]){
                    res[index++] = val;
                    if(index == k)
                        return res;
                }
        return res;
    }
}
