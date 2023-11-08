package practice.neetcode.arraysandhashing;

public class LengthOfLastWord {
    public static void main(String[] args) {
     //   System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));

    }
    public static int lengthOfLastWord(String s) {
        int length = s.length() - 1, counter = 0;
        while(length >= 0){
            if(s.charAt(length) == ' ' && counter == 0){
                length--;
                continue;
            }
            else if(s.charAt(length) != ' '){
                counter++;
            }
            else{
                break;
            }
            length--;
        }
        return counter;
    }
}
