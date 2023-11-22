package interview.salesforce;


/*
*  Given a number ‘X’.

        Starting from 1, how many minimum steps are required to reach the number X by taking one of the below steps?

        1. At each step, you can either multiply the result by 2  (or)
        2. You can add 1 to the result
        *
        *
        * 8
        * 8/1 = 8
        *
        * 8/2 = 4
        *
        * 7/2 =
        *
     /*
*  Given a number ‘X’.

        Starting from 1, how many minimum steps are required to reach the number X by taking one of the below steps?

        1. At each step, you can either multiply the result by 2  (or)
        2. You can add 1 to the result
step1:  1 + 1  = 2
        step2: 2 + 1 = 3
        step3: 3 * 2 = 6
        step4: 6 + 1 = 7
        step5: 7 * 2 = 14
        step6: 14 + 1 = 15
        Step7: 15 * 2 = 30
        step8: 30 + 1 = 31

        X=31 % 2 ==1
        +1
        counter++;
        30 % 2 == 0
        15 / 2

        X=17
        step1:  1 + 1  = 2
        step2: 2 * 2 = 4
        step3: 4 * 2 = 8
        step4: 8 * 2 = 16
        Step 5: 16+1 = 17

        step1:  1 + 1  = 2
        step2: 2 + 1 = 3
        step3: 3 * 2 = 6
        step4: 6 * 2 = 12

        Int counter = 0;
        Int sum = 1;
        while(sum<target/2){ 2<12
        Sum = sum + 1;
        couter++;
        }
        Sum = sum * 2;
remainingSteps = target - sum; 12 - 8 = 4
        Return counter + 1;
   1. DS and Algo
   2. Automation And Testing
   3. Java OOPS
* */
public class Salesforce {
    public static void main(String[] args) {
        System.out.println( minSteps(12));
        System.out.println( minSteps(31));
        System.out.println( minSteps(17));
    }
    public static int minSteps(int n){
        int steps = 0;
        while(n > 1){
            if(n % 2 == 0){
                n = n / 2;
            }
            else{
                n = n-1;
            }
            steps++;
        }
        return steps;
    }

}
