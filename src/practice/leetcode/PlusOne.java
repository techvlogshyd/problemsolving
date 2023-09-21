package practice.leetcode;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >=0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
    public static int[] plusOne2(int[] digits) {
        String sum = "";
        for (int digit:digits) {
          sum += digit;
        }
        sum = String.valueOf(Integer.parseInt(sum)+1);
        int newLength = 0;
        if(sum.length()>digits.length){
            newLength = sum.length();
        }
        else
            newLength = digits.length;
        int res[] = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            res[i] = Integer.parseInt(String.valueOf(sum.charAt(i)));
        }
        return res;
    }
    public static void main(String[] args) {
//        System.out.println(plusOne(new int[]{1,2,3}));
//        System.out.println(plusOne(new int[]{9}));
        System.out.println(plusOne(new int[]{8,9}));
        System.out.println(plusOne(new int[]{9,9}));
        System.out.println(plusOne2(new int[]{8,9}));
        System.out.println(plusOne2(new int[]{9,9}));
    }
}
