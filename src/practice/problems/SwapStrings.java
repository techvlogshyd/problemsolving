package practice.problems;

public class SwapStrings {
    public static void main(String[] args) {

        String firstString = "one";
        String secondString = "two";
        System.out.println("Before swapping....");
        System.out.println("The first String  = " + firstString);
        System.out.println("The second String = " + secondString);
        firstString = firstString + secondString; // step 1
        secondString = firstString.substring(0, (firstString.length() - secondString.length())); // step 2
        //firstString = firstString.substring(secondString.length()); // step 3
        firstString = firstString.substring(secondString.length(),firstString.length()); // step 3
        System.out.println("\nAfter swapping....");
        System.out.println("The first String  = " + firstString);
        System.out.println("The second String = " + secondString);

    }
}
