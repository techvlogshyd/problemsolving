package practice.problems;

public class Positive {
    public static int minStartValue(int[] nums)
    {
        Integer minSum=0,sum=0;
        for(int i:nums){
            sum+=i;
            minSum=Math.min(minSum,sum);
        }
        return 1-minSum;
        /*
        * -3 2 -3 4 2
        * -3 0-> -3
        * -3 2-> -1
        * -1 -3-> -4
        * -4 4-> 0
        * 0 2-> 2
        * min -4
        *
        * */
    }

    public static int minStartValue2(int[] nums)
    {
        Integer minSum=0,sum=0;
        boolean flag=false;
        for (int i = 0; i <100 ; i++) {
            sum=i;
            flag=false;
            for (int j:nums) {
                sum+=j;
                if (sum<1){
                    flag=true;
                    break;
                }
            }
            if (!flag){
                return i;
            }
        }
        return 0;
    }

    public static void main(String args[])
    {
        int[]nums={-3,2,-3,4,2};
        int ans=minStartValue2(nums);
        System.out.println(ans);
    }
}
