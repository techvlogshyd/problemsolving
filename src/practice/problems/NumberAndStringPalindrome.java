package practice.problems;

public class NumberAndStringPalindrome {
    public static boolean isPalindrome(int number){
        int digit=0, reverse =0,temp=number;
        //number 123/10=12, 12/10=1, 1/12=0
        while(number!=0){
            digit = number % 10;
            reverse=(reverse*10)+digit;
            number/=10;
        }
        System.out.println(temp+"=="+reverse);
        if (temp==reverse)
            return true;
        return false;
    }
    // Method
    // Returning true if string is palindrome
    static boolean isPalindrome(String str)
    {
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
        // While there are characters to compare
        while (i < j) {
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
        // Given string is a palindrome
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(2112));
        System.out.println(isPalindrome(-123));
        System.out.println(isPalindrome(12345));
        System.out.println(isPalindrome(-2112));
        System.out.println(isPalindrome("madam"));
    }
}
