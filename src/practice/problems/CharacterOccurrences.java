package practice.problems;

import java.util.HashMap;

public class CharacterOccurrences {
public static void printCharOccurrence(String input){
    HashMap<Character,Integer> chars=new HashMap<>();// J 1
    int counter[]=new int[input.length()];
    char nonRepeated=0,repeated=0;

    for (int i = 0; i < input.length(); i++) {
        if (!chars.containsKey(input.charAt(i)))
            chars.put(input.charAt(i),counter[i]+1);
        else if (chars.containsKey(input.charAt(i))) {
            chars.put(input.charAt(i), chars.get(input.charAt(i)) + 1);
            if (repeated == 0) {
                repeated = input.charAt(i);
            }
        }
        if (input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i))&&nonRepeated==0) {
            nonRepeated=input.charAt(i);
            System.out.println("First non repeating character:: "+nonRepeated);
        }
    }
    System.out.println("First repeating character:: "+repeated);
    System.out.println(chars);
    chars.entrySet().forEach(System.out::println);
}
    public static void printCharOccurrence2(String input) {
        HashMap<Character, Integer> chars = new HashMap<>();// J 1
        int counter[] = new int[input.length()];

        char repeated = 0, nonRepeated = 0;
        char[] letter = input.toCharArray();
        for (char c : letter) {
            if (input.indexOf(c) == input.lastIndexOf(c)) {
                if (nonRepeated == 0) {
                    nonRepeated = c;

                }
                System.out.println(c+"-1");
            } else if (input.indexOf(c) != input.lastIndexOf(c)) {
                if (repeated == 0) {
                    repeated = c;

                }
                System.out.println(c+"-"+input.lastIndexOf(c)+1);
            }
        }
        System.out.println("Repeated " + repeated + " Non repeated " + nonRepeated);
        System.out.println(chars);

    }

    public static void main(String[] args) {
        printCharOccurrence("practice.paypal.JavaConceptOfTheDay");
        printCharOccurrence("JvvaConceptOfTheDay");
        printCharOccurrence("aaabbbbcccccddddddfffffff");
    }
}
