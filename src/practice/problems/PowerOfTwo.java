package practice.problems;

public class PowerOfTwo {

// you can also use imports, for example:
// import java.util.*;

// you can write to stderr for debugging purposes, e.g.
// System.err.println("this is a debug message");

    public static void powerOfTwo(int N) {
        for(int i=1;i<=N;i++){
           if(Integer.bitCount(i)==1){
               System.out.println("POWER");
           }
            else {
                System.out.println(i);
            }
        }


    }
    public static void main(String[] args) {
        powerOfTwo(16);
    }
    }


