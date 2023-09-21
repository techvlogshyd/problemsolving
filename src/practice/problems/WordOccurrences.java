package practice.problems;

import java.util.*;

public class WordOccurrences {
    public static HashMap<String, Integer> getWordOccurance(String input) {
        String[] words = input.split(" ");
        HashMap<String, Integer> occurrences = new HashMap<>();
        int counter = 1;
        for (int i = 0; i < words.length; i++) {
            if (!occurrences.containsKey(words[i])) {
                occurrences.put(words[i], counter);
            }
            if (occurrences.containsKey(words[i])) {
                counter++;
                occurrences.put(words[i], counter);
            }
        }
        return sortByValue(occurrences);
    }
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static void main(String[] args) {
        String input="Google News is a news aggregator service developed by Google. It presents a continuous flow of links to articles organized from thousands of publishers and magazines. Google News is available as an app on Android, iOS, and the Web. Google released a beta version in September 2002 and the official app in January 2006";
        System.out.println(getWordOccurance(input));
    }
}


