package practice.leetcode;


public class LongestCommonPrefix {

    public static String commonPrefix(String[] strs){
//        StringUtils.isEmpty(strs);
        if(strs == null || strs.length == 0)    return "";
//        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(strs[0]) != 0)
                strs[0] = strs[0].substring(0,strs[0].length()-1);
            i++;
        }
        return strs[0];
    }
    public static void main(String[] args) {
        System.out.println(commonPrefix(new String[]{"flower","flow","flight"}));
    }
}
