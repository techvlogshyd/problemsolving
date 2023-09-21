package practice.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
https://www.codepile.net/pile/9qK2mJpM
find max sum of upper left 2*2 sum matrix by reversing any rows and columns

112 42 83 11
56 125 56 49
15 78 101 43
62 98 114 108



119+114+56+125=414

(00 30) (01 31) (02 32) (03 33)
(00 30) (01 31) (02 32) (03 33)
(00 30) (01 31) (02 32) (03 33)
(00 30) (01 31) (02 32) (03 33)

(03 33) (02 32) (01 31) (00 30)
(03 33) (02 32) (01 31) (00 30)
(03 33) (02 32) (01 31) (00 30)
(03 33) (02 32) (01 31) (00 30)

[[119, 83, 42, 112],
[56, 125, 56, 49],
[43, 101, 56, 15],
[108, 114, 98, 62]]

119 83 42 112
56 125 56 49
43 101 56 15
108 114 98 62


*/

public class FlipMatrixSubArrayMaxSum {
    public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        for(int t1=0;t1<t;t1++){
            int n=Integer.parseInt(in.readLine());
            String[][] s=new String[2*n][2*n];
            for(int i=0;i<2*n;i++)
                s[i]=in.readLine().split(" ");
            long sum=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    sum+=Math.max(Math.max(Integer.parseInt(s[i][j]),
                            Integer.parseInt(s[2*n-1-i][j])),
                            Math.max(Integer.parseInt(s[i][2*n-1-j]),
                                    Integer.parseInt(s[2*n-1-i][2*n-1-j])));
                }
            }
            System.out.println(sum);
        }
    }
}
