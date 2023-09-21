package practice.neetcode.arraysandhashing;

public class ProductExceptSelf {
    public static void main(String[] args) {
        for (int num:productExceptSelf(new int[]{1,2,3,4})) {
            System.out.println(num);
        }

    }
    public static int[] productExceptSelf(int[] nums){
        int[] result = new int[nums.length];
        int prefix = 1, postfix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        for (int i = nums.length-1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }
        return result;
    }
}
