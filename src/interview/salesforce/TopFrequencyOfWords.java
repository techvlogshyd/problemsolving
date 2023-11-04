package interview.salesforce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class TopFrequencyOfWords {



/*Imagine you are part of a news analysis team working for a media company. Your team regularly receives a vast collection of news articles from various sources. These articles cover a wide range of topics and can be quite lengthy.
Your task is to develop a Java program to assist your team in analyzing these articles. Specifically, you need to identify and report the most frequently occurring words in these articles. However, your analysis should be intelligent and skip common stop words like "the," "and," and "is" to focus on the most meaningful content.
Furthermore, you should consider word boundaries, ensuring that punctuation and spaces are treated correctly when counting word frequencies. The goal is to provide your team with valuable insights into the key terms and phrases used across the articles efficiently.
Your solution should not only identify the most frequent words but also present them in a user-friendly format for easy interpretation by your team. Design an efficient algorithm using data structures to accomplish this analysis effectively.

String largeTextDocument = "The quick brown fox jumps over the lazy dog. " +
    "In a world where technology is rapidly advancing, " +
    "data science and artificial intelligence are becoming crucial " +
    "for solving complex problems. " +
    "The future of AI is exciting, and we should embrace it.";
*/



    static void findFrequency(String largeTextDocument) {

        String[] words = largeTextDocument.split(" ");
        String firstWord = "";
        String secondWord = "";
        String thirdWord = "";
        int firstWordCount = Integer.MIN_VALUE;;
        int secondWordCount = Integer.MIN_VALUE;;
        int thirdWordCount = Integer.MIN_VALUE;;

        if(largeTextDocument.isEmpty() || words.length <= 1){
            System.out.print("No repeated words");
        }
        Map<String, Integer> frequency = new HashMap<>();
        for(String word : words){
            if(word.equalsIgnoreCase("the") || word.equalsIgnoreCase("and") || word.equalsIgnoreCase("is")){
                continue;
            }
            if(!frequency.containsKey(word)){
                frequency.put(word, 1);
            }
            else{
                frequency.put(word, frequency.get(word) + 1);
                }
            }
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > firstWordCount) {
                thirdWordCount = secondWordCount;
                thirdWord = secondWord;
                secondWordCount = firstWordCount;
                secondWord = firstWord;
                firstWordCount = entry.getValue();
                firstWord = entry.getKey();
            } else if (entry.getValue() > secondWordCount) {
                thirdWordCount = secondWordCount;
                thirdWord = secondWord;
                secondWordCount = entry.getValue();
                secondWord = entry.getKey();
            } else if (entry.getValue() > thirdWordCount) {
                thirdWordCount = entry.getValue();
                thirdWord = entry.getKey();
            }
        }
        System.out.println(firstWord+" frequency is "+ firstWordCount);
        System.out.println(secondWord+" frequency is "+ secondWordCount);
        System.out.println(thirdWord+" frequency is "+ thirdWordCount);
    }

    static void findFrequency2(String largeTextDocument) {

        String[] words = largeTextDocument.split(" ");


        if(largeTextDocument.isEmpty() || words.length <= 1){
            System.out.print("No repeated words");
        }
        Map<String, Integer> frequency = new HashMap<>();
        for(String word : words){
            if(word.equalsIgnoreCase("the") || word.equalsIgnoreCase("and") || word.equalsIgnoreCase("is")){
                continue;
            }
            if(!frequency.containsKey(word)){
                frequency.put(word, 1);
            }
            else{
                frequency.put(word, frequency.get(word) + 1);
            }



        }

        List<Map.Entry<String, Integer>> sortedWordFrequency = new ArrayList<>(frequency.entrySet());
        sortedWordFrequency.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        System.out.println("Top 3 most frequent words:");
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedWordFrequency) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count++;
            if (count == 3) {
                break;
            }
        }
    }




    public static void main(String[] args) {
        String largeTextDocument = "The quick quick quick quick brown fox jumps over the lazy dog. " +
                "In a world where technology is rapidly advancing, " +
                "data science and artificial intelligence are becoming crucial " +
                "for solving complex problems. " +
                "The future of AI is exciting, and we should embrace it.";
       // String largeTextDocument2 = "test1, test2, test3, test4,test1, test2, test3, test4, test1, test2, test3, test4, test1, test2, test3, test1, test2, test1";
        findFrequency(largeTextDocument);
        findFrequency2(largeTextDocument);
        String largeTextDocument2 = "test1 test2 test3 test4 test1 test2 test3 test1 test2 test1 test2 test2 test3 test3 test3 test3";
        findFrequency(largeTextDocument2);
        findFrequency2(largeTextDocument2);

    }

}
