package practice.problems;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer,int temperature){
        if (summer) {
            if (temperature >= 25 && temperature <= 45)
                return true;
            return false;
        }
        else
        {
            if (temperature >= 25 && temperature <= 35)
                return true;
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,50));
        System.out.println(isCatPlaying(true,45));
        System.out.println(isCatPlaying(false,50));
        System.out.println(isCatPlaying(false,35));
    }
}
