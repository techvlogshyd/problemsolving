package practice.neetcode.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }
    public static boolean containsDuplicate(int[] nums){
        Set<Integer> values = new HashSet<>();
        for (int value : nums)
        {
            if(values.contains(value)){
                return true;
            }
            else{
                values.add(value);
            }
        }
        return false;
    }
}
