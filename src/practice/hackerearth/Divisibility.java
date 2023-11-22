package practice.hackerearth;

import java.util.Scanner;

public class Divisibility {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=0;
        for(int i=0;i<n;i++){
            num=sc.nextInt();
        }
        System.out.print((num%10==0)?"Yes":"No");
    }
}
