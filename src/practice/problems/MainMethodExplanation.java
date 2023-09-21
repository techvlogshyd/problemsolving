package practice.problems;

public class MainMethodExplanation {
    public static void main(String[] args) {
        //public- main method should be called externally by JRE
        //static- Doesn't require to create an object
        //void- Doesn't return anything
        //main- JRE/JVM always calls main method
        //String[] args- Can pass args values from cmd line and run with configuration

        System.out.println(args[0]);

    }
}
