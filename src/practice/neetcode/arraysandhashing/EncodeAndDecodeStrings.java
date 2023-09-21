package practice.neetcode.arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        String input[] = new String[]{"neet","code","challenge"};
        String encoded = encode(Arrays.asList(input));
        System.out.println(encoded);
        System.out.println(decode(encoded));
    }
    public static String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public static List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        //Iterate each character of encoded string
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#')
            {
                j++;
            }
            //Find the length of the chars to form a decoded word
            int length = Integer.valueOf(str.substring(i, j));
            //Update i value to move to next word to decode
            i = j + 1 + length;
            //Add sub string starting post #(+1) to next word
            list.add(str.substring(j + 1, i));
        }
        return list;
    }
}
