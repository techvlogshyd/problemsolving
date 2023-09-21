package practice.problems;

public class LargestSumOfSubArray {

    public static int largestSum(int arr[]){
        int sum=0,maxSum=Integer.MIN_VALUE;
        for (int e:arr) {
            sum=sum+e;
            if(e>sum){
                sum=e;
            }
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                largestSum(a));
    }

}
