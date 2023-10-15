package practice.leetcode;

public class AddBinary
{
    public static void main(String[] args) {
        String a = "111", b = "111";
        System.out.println(addBinary(a, b));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinary2("1010", "1011"));

    }
    public static String addBinary(String a, String b){
        int aLength = a.length() - 1, bLength = b.length() - 1;
        String result = "";
        int carry = 0;
        while(aLength >= 0 || bLength >= 0){
            int sum = carry;
            if(aLength >= 0){
                sum += a.charAt(aLength--) - '0';
            }
            if(bLength >= 0){
                sum += b.charAt(bLength--) - '0';
            }
            carry = sum > 1 ? 1 : 0;
            result = String.valueOf(sum % 2) + result;
            //result = result + String.valueOf(sum % 2);
        }
        if(carry == 1){
            result = carry + result;
            //result = result + carry;
        }
        return result;
    }
    public static String addBinary2(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        String result = "";

        while (i >= 0 || j >= 0 || carry == 1)
        {
            if(i >= 0)
                carry += a.charAt(i--) - '0';
            if(j >= 0)
                carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}
