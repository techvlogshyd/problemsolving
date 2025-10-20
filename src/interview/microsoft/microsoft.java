package interview.microsoft;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class microsoft {


    public static void main(String[] args) {
        //int[] arr = {2, 1, 3, 5, 3, 2 };
//        int[] arr = {1, 2, 1, 2, 3, 3 };
//        System.out.println(findDuplicate(arr));
        String input = "abacabad";
        findNonRepeatedChar(input);
    }

//    public static int findDuplicate(int[] nums){
//        Set<Integer> set = new HashSet<>();
//        for(int num : nums){
//            if(set.contains(num)){
//                return num;
//            }
//            set.add(num);
//        }
//        return -1;
//    }
    public static void findNonRepeatedChar(String input){
        Map<Character, Integer> lookUp = new HashMap<>();
        for(char ch : input.toCharArray()){
             lookUp.put(ch, lookUp.getOrDefault(ch, 0) +1);
        }
        System.out.println(lookUp);
        for(Map.Entry<Character, Integer> entry : lookUp.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }

    }

}
