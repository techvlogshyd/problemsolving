package practice.neetcode.arraysandhashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
        System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

        public static int longestConsecutive(int[] nums) {
            if (nums.length == 0) return 0;
            HashSet<Integer> hs = new HashSet<>();
            for(int num:nums) hs.add(num);
            int longest =1;
            for(int num: nums ){
                //check if the num is the start of a sequence by checking if left exists
                if(!hs.contains(num-1)){ // start of a sequence
                    int count =1;
                    while(hs.contains(num + 1)){ // check if hs contains next no.
                        num++;
                        count++;
                    }
                    longest = Math.max(longest, count);
                }
                //Break the loop on reaching half-length of the array as it is the longest since other sets can't go beyond
                if(longest > nums.length/2) break;
            }
            return longest;
        }



}
