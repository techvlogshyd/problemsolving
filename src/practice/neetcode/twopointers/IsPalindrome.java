package practice.neetcode.twopointers;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s){
        int left = 0, right = s.length()-1;
        while(left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(!Character.isLetterOrDigit(leftChar)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(rightChar)){
                right--;
                continue;
            }
            if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
