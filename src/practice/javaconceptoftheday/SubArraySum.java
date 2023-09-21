package practice.javaconceptoftheday;

import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args)
    {
//        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
//
//        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);
//
//        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
        System.out.println(countSubArraysWithSumK(new int[]{15, 51, 7, 81, 5, 11, 25}, 41));
    }

    private static void findSubArray(int[] inputArray, int targetSum) {
        int index1 = 0, index2 = 0, sum = 0;
        while(index1<inputArray.length){
            sum+=inputArray[index2];
            if(sum==targetSum){
                break;
            } else if (sum<targetSum) {
                sum+=inputArray[index2];
                index2++;
            }
            else{
                index1++;
                index2++;
                sum=0;
            }
        }
        for (int i = index1; i < index2; i++) {
            System.out.println(inputArray[i]);
        }

    }
    public static int countSubArraysWithSumK(int[] a, int K) {
        int n = a.length;
        HashMap< Integer, Integer > hash = new HashMap < > ();
        int count = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum == K) {
                count++;
            }
            if (hash.get(sum - K) != null) {
                count += hash.get(sum - K);
            }
            if (hash.get(sum) != null) {
                hash.put(sum, hash.get(sum) + 1);
            } else {
                hash.put(sum, 1);
            }
        }
        return count;
    }
}
