package practice.javaconceptoftheday.strings;

public class Conversion {
    public static void main(String[] args) {
        int intInput = 2023;
        int result = Integer.parseInt(String.valueOf(intInput));
        System.out.println(String.valueOf(intInput));

        String stringInput = "2023";
        System.out.println(Integer.valueOf(2023));

        int intValue = 10;
        double doubleValue = intValue; // Implicit conversion from int to double
        System.out.println("Implicit Conversion (Widening): " + doubleValue);

        double doubleValue2 = 10.5;
        int intValue2 = (int) doubleValue2; // Explicit conversion from double to int
        System.out.println("Explicit Conversion (Narrowing): " + intValue2);

        String strValue = "123";
        int intValueFromString = Integer.parseInt(strValue); // Convert String to int
        System.out.println("String to Integer: " + intValueFromString);

        int intValue3 = 456;
        String strValueFromInt = Integer.toString(intValue3); // Convert int to String
        System.out.println("Integer to String: " + strValueFromInt);

        Object value = 123;
        if (value instanceof Integer) {
            System.out.println("Variable is an Integer");
        } else {
            System.out.println("Variable is not an Integer");
        }

        String strValue2 = "123";
        if (strValue2.matches("\\d+")) {
            System.out.println("String is a Number");
        } else {
            System.out.println("String is not a Number");
        }

        Object valueObj = "Hello";
        if (valueObj instanceof String) {
            System.out.println("Object is a String");
        } else {
            System.out.println("Object is not a String");
        }

        System.out.println(Character.isAlphabetic('1'));
        System.out.println(Character.isDigit('a'));




    }
}
