package practice.javaconceptoftheday.strings;

public class StringReversePreservingSpaces {
    public static void main(String[] args) {
        System.out.println(reverseString("I am Prasanna"));
        System.out.println(reverseString("I Am Not String"));
        System.out.println(reverseString("JAVA JSP ANDROID"));
        System.out.println(reverseString("1 22 333 4444 55555"));
    }
    static String reverseString(String input){
        char[] inputCharArray = input.toCharArray();
        char[] result = new char[inputCharArray.length];
        for (int i = 0; i < inputCharArray.length; i++) {
            if (inputCharArray[i] == ' '){
                result[i] = ' ';
            }
        }
        int j = 0;
        for (int i = inputCharArray.length-1; i >= 0 ; i--) {
            if(inputCharArray[i] != ' ') {
                if (result[j] == ' ') {
                    j++;
                }
                result[j] = inputCharArray[i];
                j++;
            }
        }
        return String.valueOf(result);

    }
}
