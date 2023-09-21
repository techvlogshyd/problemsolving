package practice.problems;

public class DigitSumRecursive {
    public static int superDigit(String n, int k) {
        // Write your code here
        int sum=0;
        String result="";
        if(k>1){
            for (int i = 0; i < k; i++) {
                result+=n;
            }
            n=result;
        }
        for (int i = 0; i < n.length(); i++) {
            sum+=Character.getNumericValue(n.charAt(i));
        }
        if(n.length()==1)
            return Integer.parseInt(n);
        return superDigit(Integer.toString(sum), 0);
    }

    public static void main(String[] args) {
        System.out.println(superDigit("148",3));
    }

}
