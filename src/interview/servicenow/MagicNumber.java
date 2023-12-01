package interview.servicenow;

import java.util.HashSet;
import java.util.Set;

public class MagicNumber {

//    2. Program to check if any number is a magic number or not. A number is said to be a magic number if after doing sum of digits in each step
//    and inturn doing sum of digits of that sum, the ultimate result (when there is only one digit left) is 1.
//    For ex-1234
//            1+2+3+4 = 10
//            1+0=1
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(isMagic(num));
        System.out.println(isMagic2(num));
        System.out.println(isMagic(2));
        System.out.println(isMagic2(2));

    }
    static boolean isMagic(int num){
        return num % 9 == 1 ? true : false;
    }
    static boolean isMagic2(int num){
        Set<Integer> visited = new HashSet<>();
        while(!visited.contains(num)){
            visited.add(num);
            int sum = 0;
            while(num != 0){
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }
            num = sum;
            if(num == 1)
                return true;
        }
        return false;
    }
}
