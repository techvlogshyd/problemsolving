package practice.faq;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWords {
    public static void main(String[] args) {
        String input = "test1 test2 test3 test4 test1 test2 test3 test1 test2 test1 test2 test2 test2 test3 test3 test3 test3 test1 test1";
        findDuplicates(input);
    }
    static void findDuplicates(String input){

        Map<String, Integer> frequency = new HashMap<>();
        for(String word : input.split(" ")){
            frequency.put(word, 1 + frequency.getOrDefault(word,0));
        }
        Set<Entry<String, Integer>> entrySet = frequency.entrySet();
        for(Entry<String, Integer> entry : entrySet){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " Occurred "+entry.getValue()+" times.");
            }
        }


    }
}

