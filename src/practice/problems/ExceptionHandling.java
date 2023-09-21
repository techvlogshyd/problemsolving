package practice.problems;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int myInt=Integer.parseInt("test");
        }catch (NumberFormatException |NullPointerException ne){
            System.out.println("Invalid number format");
        }
        catch (RuntimeException re){
            System.out.println("Runtime exception");
        }
        finally {
            System.out.println("Finally");//Mostly used closing db connections or file connections
        }
        System.out.println(printNo());//Finally always run and will override try/catch return value
    }
    private static int printNo(){
        try {
            return 3;
        }catch (Exception e){
            return 4;
        }
        finally {
            return 5;
        }
    }
}
