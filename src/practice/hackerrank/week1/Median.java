package practice.hackerrank.week1;

import java.util.*;

public class Median {
    public static void main(String[] args) {
        //Integer[] values = { 2, 3, 6, 12, 34, 65, 78, 99,15 };
        Integer[] values = {0,1,2,4,6,5,3};
        System.out.println(findMedian3(Arrays.asList(values)));
        System.out.println(findMedian(Arrays.asList(values)));
        System.out.println(findMedian2(Arrays.asList(values)));
    }
    public static int findMedian(List<Integer> arr){
        Collections.sort(arr);
        return arr.get(arr.size()/2);
    }
    public static int findMedian2(List<Integer> arr) {
        // Write your code here
        int i=0;
        int n=arr.size();
        int[] ar = new int[n];
        for(Integer a:arr)
        {
            ar[i]=a;
            i++;
        }
        int l=ar.length;
        Arrays.sort(ar);
        return(ar[l/2]);

    }
    public static int findMedian3(List<Integer> arr) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        queue.addAll(arr);
        for (int i = 0; i < arr.size()/2; i++) {
            queue.poll();
        }
        return queue.peek();
    }
    public static int lonelyinteger(List<Integer> a) {
        Set<Integer> uniqueNumbers=new HashSet<>();
        for (int i = 0; i < a.size(); i++) {
            if(uniqueNumbers.contains(a.get(i))){
                return a.get(i);
            }
            else
                uniqueNumbers.add(a.get(i));
        }

        return 0;
    }
}
