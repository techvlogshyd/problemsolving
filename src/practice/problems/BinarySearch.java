package practice.problems;

public class BinarySearch {
    public static int searchRecursive(int[] input,int l, int r,int key){
        int mid=l+(r-l)/2;
        if (input[mid]==key)
            return mid;
        else if (key>input[mid])
            return searchRecursive(input,input[mid+1],r,key);
        else if (key<input[mid])
            return searchRecursive(input, l, mid-1, key);
        return -1;
    }
    public static int searchIterative(int[] input,int l, int r,int key){

        while (l<=r){
            int mid=l+(r-l)/2;
            if (input[mid]==key)
                return mid;
            else if (key<input[mid])
                r=mid-1;
            else if(key>input[mid])
                l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] input={1,2,3,4,5,6,7,8,9};
        System.out.println(searchRecursive(input,0,input.length-1,4));
        System.out.println(searchIterative(input,0,input.length-1,4));
        System.out.println(searchRecursive(input,0,input.length-1,8));
        System.out.println(searchIterative(input,0,input.length-1,8));
        System.out.println(searchIterative(input,0,input.length-1,9));
        System.out.println(searchIterative(input,0,input.length-1,9));
    }
}
