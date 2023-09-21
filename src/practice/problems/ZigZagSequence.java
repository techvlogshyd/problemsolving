package practice.problems;

import java.util.Arrays;

public class ZigZagSequence {
    public static void main (String[] args) throws java.lang.Exception {
//        Scanner kb = new Scanner(System.in);
//        int test_cases = kb.nextInt();
//        for(int cs = 1; cs <= test_cases; cs++){
//            int n = kb.nextInt();
            int a[] = new int[5];
            a= new int[]{2, 3, 5, 1, 4};
//            for(int i = 0; i < n; i++){
//                a[i] = kb.nextInt();
//            }
            findZigZagSequence(a, 5);
        }

    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = (n + 1)/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = 0;
        int ed = n - 1;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed -1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
