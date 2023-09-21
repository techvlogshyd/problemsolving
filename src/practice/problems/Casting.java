package practice.problems;

public class Casting {
    public static void main(String[] args) {
        byte myByteMinVal=Byte.MIN_VALUE;
        byte myByteMaxVal=Byte.MAX_VALUE;
        byte myByteNewVal=(byte)(myByteMaxVal/2);
        int myIntVal=2345;
        short myNewShortVal=(short)(myIntVal/2);
    }
}
