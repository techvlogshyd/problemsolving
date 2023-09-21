package practice.problems;

public class FindHeavierBall {
public static int heavierBall(int[] weights){
    int sum1=weights[0]+weights[1]+weights[2]+weights[3]+weights[4]+weights[5]+weights[6]+weights[7]+weights[8];
    int sum2=weights[9]+weights[10]+weights[11]+weights[12]+weights[13]+weights[14]+weights[15]+weights[16]+weights[17];
    int sum3=weights[18]+weights[19]+weights[20]+weights[21]+weights[22]+weights[23]+weights[24]+weights[25]+weights[26];
    int requiredSum=0,requiredStartIndex,requiredEndIndex,counter=0;

    if (sum1==sum2) {
        requiredStartIndex = 18;
        requiredEndIndex = 26;
    }
    else if (sum2==sum3){
        requiredStartIndex = 0;
        requiredEndIndex = 8;
    }
    else {
        requiredStartIndex = 9;
        requiredEndIndex = 17;
    }
    for (int i = requiredStartIndex; i <=requiredEndIndex ; i++) {

    }
    return -1;
}
}
