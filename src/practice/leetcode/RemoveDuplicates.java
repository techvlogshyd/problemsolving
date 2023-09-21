package practice.leetcode;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1])
                count++;
            else
                nums[i-count] = nums[i];
        }
        return nums.length-count;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2,2,3}));
    }
}
