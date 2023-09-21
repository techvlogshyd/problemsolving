package practice.problems;

public class CheckStringContentIgnoringCases {
//two strings are the same ignoring their cases
public static void main(String[] args) {

    String firstString = "My Name Is Gaurav!";

    String secondString = "my name is gaurav!";

    // Case 1
    // Check if the strings are same using the simple equals() method
    System.out.println("checking using equals() method : " + firstString.equals(secondString));

    // Case 2
    // Check if the strings are same using the equalsIgnoreCase() method
    System.out.println("checking using equalsIgnoreCase() method : " + firstString.equalsIgnoreCase(secondString));

}

}
