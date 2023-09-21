package interview.twilio;

import java.util.Arrays;


public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. */

        System.out.println(Arrays.toString(wareHouse(5,6,"PL")));
        System.out.println(Arrays.toString(wareHouse(5,6,"PML")));
        System.out.println(Arrays.toString(wareHouse(5,6,"PLPLPL")));
        System.out.println(Arrays.toString(wareHouse(5,6,"PMMML")));
        System.out.println(Arrays.toString(wareHouse(5,6,"PMMMMML")));
        System.out.println(Arrays.toString(wareHouse(5,6,"PLPMLPLPLPLPMMMLPMMMMML")));
        System.out.println(Arrays.toString(wareHouse(5,6,"PLMMMMMMMMMMPLPLPLPLPL")));
        System.out.println(Arrays.toString(wareHouse(5,6,"MMMLL")));


    }
    //PLPML
    public static int[] wareHouse(int height, int length, String instruction){
        int[] wareHouse=new int[length];
        int index=0;
        char[] commands=instruction.toCharArray();
        boolean pick=false;
        for (char c:commands) {
            if(c=='P'||c=='M'||c=='L'){
                switch(c){
                    case 'P':
                        index=0;
                        pick=true;
                        break;
                    case 'M':
                        if(index<length){
                            index++;
                        }
                        break;
                    case 'L':
                        if(index < length && pick && wareHouse[index]<height){
                            wareHouse[index]+=1;
                            pick=false;
                        }
                        break;
                }

            }

        }
        return wareHouse;




    }

}