package practice.hackerrank.mocks;

import java.util.*;

public class Anagram {
    public static int anagram(String s) {
        char[] ch1 = s.substring(0, s.length()/2).toCharArray();
        char[] ch2 = s.substring(s.length()/2, s.length()).toCharArray();
        int counter = 0;
        System.out.println(ch1);
        System.out.println(ch2);
        if(ch1.length != ch2.length)
            return -1;

        Map<Character, Integer> result1= new HashMap<>();
        Map<Character, Integer> result2= new HashMap<>();
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < ch1.length; i++) {
            if(!result1.containsKey(ch1[i])){
                result1.put(ch1[i],1);
            }
            else if(result1.containsKey(ch1[i])){
                result1.put(ch1[i],result1.get(ch1[1])+1);
            }
            if(!result2.containsKey(ch2[i])){
                result2.put(ch2[i],1);
            }
            else if(result2.containsKey(ch2[i])){
                result2.put(ch2[i],result2.get(ch2[1])+1);
            }
            uniqueChars.add(ch1[i]);
        }

        for (Character ch:uniqueChars) {
            if(result1.get(ch) != result2.get(ch)){
                if(result1.get(ch)==null)
                    counter = counter+Math.abs(0-result2.get(ch));
                else if(result2.get(ch)==null)
                    counter = counter+Math.abs(result1.get(ch)-0);
                else
                    counter = counter+Math.abs(result1.get(ch)-result2.get(ch));
            }
        }

        return counter;
    }
    public static void main(String[] args) {
//        System.out.println(anagram("aaabbb"));
//        System.out.println(anagram("abccde"));
        System.out.println(anagram("xaxbbbxx"));
    }
}



