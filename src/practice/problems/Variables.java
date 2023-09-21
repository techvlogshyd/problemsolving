package practice.problems;

public class Variables {
    public static void main(String[] args) {
        int myFirstNo=(5+5)+(2*19);
        int mySecondNumber=6;
        int myThirdNumber=8;
        int myTotal=myFirstNo+mySecondNumber+myThirdNumber;
        System.out.println(myTotal);
        int myLastOne=1000-myTotal;
        System.out.println(myLastOne);
        int myMinIntValue=Integer.MIN_VALUE;
        int myMaxIntValue=Integer.MAX_VALUE;
        System.out.println("Integer min value = "+myMinIntValue);
        System.out.println("Integer max value = "+myMaxIntValue);
        System.out.println("Busted max value = "+(myMaxIntValue+1));
        System.out.println("Busted min value = "+(myMinIntValue-1));
        int myMaxIntTest=2147483647;
        int myMinIntTest=-2147483648;

        byte myByteMinVal=Byte.MIN_VALUE;
        byte myByteMaxVal=Byte.MAX_VALUE;
        System.out.println("ByteMinVal "+myByteMinVal+" ByteMaxVal "+myByteMaxVal);

        short myShortMinVal=Short.MIN_VALUE;
        short myShortMaxVal=Short.MAX_VALUE;
        System.out.println("ShortMinVal:"+myShortMinVal+" ShortMaxVal "+myShortMaxVal);

        long myLongValue=100L;
        long myLongMinVal=Long.MIN_VALUE;
        long myLongMaxVal=Long.MAX_VALUE;
        System.out.println("LongMinVal:"+myLongMinVal+" LongMaxVal "+myLongMaxVal);

    }
}
