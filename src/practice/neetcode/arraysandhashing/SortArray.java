package practice.neetcode.arraysandhashing;

import java.util.ArrayList;

public class SortArray {
    public static void main(String[] args) {
        for(int num : sortArray(new int[]{5, 2, 3, 1})) {
            System.out.println(num);
        }
    }
        //Using Merge Sort
        public static int[] sortArray(int[] nums) {
            mergeSort(nums, 0, nums.length-1);
            return nums;
        }
        public static void mergeSort(int []arr, int low, int high){
            if(low >= high) return;

            int mid = (low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, high, mid);
        }
        public static void merge(int []arr, int low, int high, int mid){
            ArrayList<Integer> temp = new ArrayList<>();
            int left = low;
            int right = mid+1;

            while(left <= mid && right <= high){
                if(arr[left] <= arr[right]){
                    temp.add(arr[left]);
                    left++;
                }else{
                    temp.add(arr[right]);
                    right++;
                }
            }
            while(left <= mid){
                temp.add(arr[left]);
                left++;
            }
            while(right <= high){
                temp.add(arr[right]);
                right++;
            }
            for(int i=low; i<= high; i++){
                arr[i] = temp.get(i-low);
            }
        }
    }
