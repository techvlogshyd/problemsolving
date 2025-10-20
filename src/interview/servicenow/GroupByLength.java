package interview.servicenow;

import java.util.*;

public class GroupByLength {

//    Can you write a java code Group the strings by Length
//    Below are the strings:
//            "test", "QA", "automation", "Java", "Selenium", "AI"
//    Output should:
//    Length 4: [test, Java]

    public static void main(String[] args) {
        List<String> words = Arrays.asList("test", "QA", "automation", "Java", "Selenium", "AI");

        // Group by length
        Map<Integer, List<String>> grouped = new HashMap<>();
        for (String word : words) {
            int len = word.length();
            if (!grouped.containsKey(len)){
                grouped.put(len, new ArrayList<>());
            }
            grouped.get(len).add(word);
        }

        System.out.println(grouped.get(4));
    }


}
