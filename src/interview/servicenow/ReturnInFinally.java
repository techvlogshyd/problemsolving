package interview.servicenow;

import java.util.*;

public class ReturnInFinally {
    public static int testReturn() {
        try {
            System.out.println("In try block");
            return 1;
        } catch (Exception e) {
            System.out.println("In catch block");
            return 2;
        } finally {
            System.out.println("In finally block");
            return 3;
        }
    }

    public static void main(String[] args) {
        int result = testReturn();
        System.out.println("Returned value: " + result);
    }
    //In try block
    //In finally block
    //Returned value: 1


}