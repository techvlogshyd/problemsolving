package practice.problems;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor2(int first,int second){
        Set<Integer> divisors=new HashSet<>();
        if (first<10||second<10)
        return -1;
        for (int i = 1; i < ((first<second?first:second)); i++) {
            if(((first%i)==0)&&((second%i)==0)){
                divisors.add(i);
            }
        }
        return Collections.max(divisors);
    }
    public static int getGreatestCommonDivisor1(int first, int second) {
        if (first < 10 || second < 10) return -1;
        int GreatestCommonDivisor =0;
        int lesser = first < second ? first : second;
        for (int i = 1 ;i <= lesser; i++){
            GreatestCommonDivisor = (first%i==0)&&(second%i==0)? i: GreatestCommonDivisor;
        }
        return GreatestCommonDivisor;

    }
    public static int getGreatestCommonDivisor(int first,int second){
        if (first<10||second<10)
            return -1;
        while (first != second) {
            if(first > second) {
                first = first - second;
            }else {
                second = second - first;
            }
        }
        return first;
    }
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor2(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
        System.out.println(getGreatestCommonDivisor(25,13));
        System.out.println(getGreatestCommonDivisor1(10,20));
        System.out.println(getGreatestCommonDivisor(10,20));
    }
}
