package practice.problems;

public class TeenNumberChecker {
    public static boolean hasTeen(int boy1,int boy2,int boy3){
        if((boy1>=13&&boy1<=19)||(boy2>=13&&boy2<=19)||(boy3>=13&&boy3<=19)){
            return true;
        }
        return false;
    }
    public static boolean isTeen(int boy){
        if((boy>=13&&boy<=19))
            return true;
        return false;
    }
}
