package practice.problems;

public class CamelCase {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named interview.agoda.netskope.Solution. */

        String input = "C;M;mouse pad";

        StringBuilder str = new StringBuilder("");
        if (input.split("\\;")[0].equals("S")) {
            String[] words = input.split("\\;")[2].split("(?=\\p{Upper})");
            for (int i = 0; i < words.length; i++) {
                str.append(words[i].replace("()", "").toLowerCase());
                if (!words[i].contains("()") || i != words.length - 1) {
                    str.append(" ");
                }
            }
            System.out.println(str);
        } else if (input.split("\\;")[0].equals("C")) {
            String[] words = input.split("\\;")[2].split("\\s");
            for (int i = 0; i < words.length; i++) {
                if (input.split("\\;")[1].equals("M")) {

                    if (i == 0) {
                        str.append(words[i]);
                    } else if (i != 0) {
                        str.append(String.valueOf(Character.toUpperCase(words[i].charAt(0))));
                        str.append(words[i].substring(1, words[i].length()));
                    }
                    if (i == words.length-1) {
                        str.append("()");
                    }


                } else if (input.split("\\;")[1].equals("V")) {

                    if (i == 0) {
                        str.append(words[i]);
                    } else if (i != 0) {
                        str.append(String.valueOf(Character.toUpperCase(words[i].charAt(0))));
                        str.append(words[i].substring(1, words[i].length()));
                    }

                } else if (input.split("\\;")[1].equals("C")) {
                    str.append(String.valueOf(Character.toUpperCase(words[i].charAt(0))));
                    str.append(words[i].substring(1, words[i].length()));

                }
            }
            System.out.println(str);
        }
    }
}
