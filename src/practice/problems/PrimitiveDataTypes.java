package practice.problems;

public class PrimitiveDataTypes {

    // -128 to 127
    byte myByte=12;

    //-32,768 to 32,767
    short myShort=1234;

    //-2,147,483,648 to 2,147,483,648
    int myInt=12345;

    //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    long myLong=1234567890;

    //about 6 decimal digits
    float myFloat=6.3f;

    //about 15 decimal digits
    double myDouble=45.213434;

    //true or false
    boolean myBoolean=true;
    boolean moreThan1000=(myInt>10000);

    //one character
    char myChar='W';

    public static void main(String[] args) {
        int myIntVal=15;
        float myFloatVal=5f/2f;
        double myDoubleVal=5d/2d;
        double myDoubleVal2=5.00 / 2.00;
        System.out.println("Int "+myIntVal+" myFloat "+myFloatVal+" myDouble "+myDoubleVal+" myDoubleVal2 "+myDoubleVal2);
        double pounds=200d;
        double poundToKg=0.45359237d;
        System.out.println(poundToKg*pounds);
        //one character
        char myChar='D';
        char myCharUnicode1='\u0044';
        System.out.println(myCharUnicode1);
        char myCharUnicode='\u00A9';
        System.out.println(myCharUnicode);
    }



}
