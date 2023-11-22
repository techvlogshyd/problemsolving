package practice.javaconceptoftheday.strings;

public class NumberOfWords {
    public static void main(String[] args) {
        String inputString = "The quick brown fox jumps over the lazy dog. " +
                "In a world where technology is rapidly advancing, " +
                "data science and artificial intelligence are becoming crucial " +
                "for solving complex problems. " +
                "The future of AI is exciting, and we should embrace it.";
        String inputString2 = "The quick brown fox jumps over the lazy dog.";
        System.out.println(numberOfWords(inputString));
        System.out.println(numberOfWords(inputString2));

    }
    static int numberOfWords(String input){
        return input.split(" ").length;
    }

}
