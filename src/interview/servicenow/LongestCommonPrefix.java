package interview.servicenow;


//19. Find the longest common prefix string amongst an array of strings.
//        Input: strs = ["flower",
//        , "flow", "flight"|Output: "f"
//        If there is no common prefix, return an empty string".
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(commonPrefix(new String[]{"flower","flow","flight"}));
    }
    static String commonPrefix(String[] input){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input[0].length(); i++) {
            for (String str : input) {
                if(i == str.length() || input[0].charAt(i) != str.charAt(i)){
                    return result.toString();
                }
            }
            result.append(input[0].charAt(i));
        }
        return result.toString();
    }
}
