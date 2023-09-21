package practice.problems;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int totalCount = (bigCount * 5) + (smallCount);
        int remainingGoal = goal % 5;
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        if (totalCount < goal)
            return false;
        else {
            if (remainingGoal == 0)
                return true;
            else if (remainingGoal <= smallCount)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(3,2,17));
        System.out.println(canPack(1,0,6));
        System.out.println(canPack(1,0,6));
    }
}
