package interview.servicenow;

import java.util.*;

public class FindDuplicatesInAnArray {
    static List<Integer> findDuplicates(int[] nums){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                result.add(index + 1);
            }
            nums[index] = -nums[index];
        }
        return result;
    }
    static List<Integer> findDuplicates2(int[] nums){
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0)+1);
        }
        Set<Map.Entry<Integer, Integer>> entrySet = frequency.entrySet();
        for(Map.Entry<Integer, Integer> entry : entrySet){
            if(entry.getValue() > 1){
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3}));
        System.out.println(findDuplicates2(new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3}));
    }
}
