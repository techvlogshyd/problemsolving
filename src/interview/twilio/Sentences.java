package interview.twilio;

import java.util.*;

import static java.util.stream.Collectors.joining;


public class Sentences {

   /*
   2. How many Sentences?

    Given an array of words and an array of sentences, determine which words are anagrams of each other.
    Calculate how many sentences can be created by replacing any word with one of its anagrams.

    Example

    wordSet = ['listen', 'silent', 'it', 'is']
    sentence = 'listen it is silent'

    Determine that listen is an anagram of silent. Those two words can be replaced with their anagrams.
    The four sentences that can be created are:

    listen it is silent
    listen it is listen
    silent it is silent
    silent it is listen

    Function Description
    Complete the countSentences function in the editor below.

    countSentences has the following parameters:

    string wordSet[n]:  an array of strings
    string sentences[m]:  an array of strings

    Returns:
    int[]: an array of m integers that denote the number of sentences that can be formed from each sentence
    Constraints

    0 < n ≤ 105
            1 ≤ length of each word ≤ 20
            1 ≤ m ≤ 1000
            3 ≤  words in a sentence ≤ 20

    Input Format For Custom Testing

    Input from stdin will be processed and passed to the function as follows:
    The first line contains an integer n denoting the number of elements in wordSet[].
    Each of the next n lines contains a string wordSet[i].
    The next line contains an integer m denoting the number of elements in sentences[].
    Each of the next m lines contains a string sentences[i] made up of a number of words separated by spaces.
    Sample Case 0

    Sample Input

    STDIN     Function
-----     -----
        6      →  wordSet[] size n = 6
    the    →  wordSet = ['the', 'bats', 'tabs', 'in', 'cat', 'act']
    bats
            tabs
    in
            cat
    act
3      → sentences[] size m = 3
    cat the bats  →  sentences = ['cat the bats', 'in the act', 'act tabs in']
    in the act
    act tabs in

    Sample Output
4
        2
        4

    Explanation

    Sentence 1: For the sentence 'cat the bats', the sentences that can be formed are:
    cat the bats
    act the bats
    cat the tabs
    act the tabs

    Sentence 2: For the sentence 'in the act', the sentences that can be formed are:

    in the act
    in the cat

    Sentence 3: For the sentence 'act tabs in', the sentences that can be formed are:

    act tabs in
    cat tabs in
    act bats in
    cat bats in

    Input (stdin)
    6
    the
            bats
    tabs
            in
    cat
            act
    3
    cat the bats
    in the act
    act tabs in

    Your Output (stdout)
    4
            2
            4

    Expected Output
    4
            2
            4*/

    public static int[] countSentences(List<String> wordSet, List<String> sentences) {
        int[] count = new int[sentences.size()];

        HashMap<String, List<String>> wordMap = new HashMap<>();
        HashMap<String, List<String>> sentenceMap = new HashMap<>();
        for (String word : wordSet) {
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);

            if (wordMap.get(sorted) != null) {
                List<String> list = wordMap.get(sorted);
                list.add(word);
                wordMap.put(sorted, list);
                sentenceMap.put(word, list);
            } else {
                List<String> list = new ArrayList<String>();
                list.add(word);
                wordMap.put(sorted, list);
                sentenceMap.put(word, list);
            }

        }
        int index = 0;
        for (String sentence : sentences) {
            int c = 1;
            String[] strArr = sentence.trim().split(" ");
            for (String str : strArr) {
                if (sentenceMap.get(str) != null) {
                    List<String> list = sentenceMap.get(str);
                    c = c * list.size();
                }
            }
            count[index++] = c;
        }

        return count;

    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(countSentences(Arrays.asList("listen", "silent", "it", "is"),Arrays.asList("listen it is silent"))));
        System.out.println(Arrays.toString(countSentences(Arrays.asList("the", "bats", "tabs", "in", "cat", "act"),Arrays.asList("cat the bats", "in the act", "act tabs in"))));

    }

}
