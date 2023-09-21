package practice.problems;

import java.util.*;

public class CountNumberOfPairIntegersInList {
    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer,Integer> socks=new HashMap<>();
        if(n<=1)
            return 0;
        int noOfPairs=0;
        for(int i=0;i<n;i++){
            if (!socks.containsKey(ar.get(i)))
                socks.put(ar.get(i),1);
            else if (socks.containsKey(ar.get(i))) {
                socks.put(ar.get(i), socks.get(ar.get(i)) + 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : socks.entrySet()){
            if(entry.getValue()>1)
                noOfPairs+=entry.getValue()/2;
        }
        return noOfPairs;
    }

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>(){{}};
//        Collections.addAll(list,10,20,20,10,10,30,50,10,20);
//        System.out.println(sockMerchant(9,list));

        //Collections.addAll(list,   6,5,2,3,5,2,2,1,1,5,1,3,3,3,5);
        Collections.addAll(list,   10,20,30);
        System.out.println(sockMerchant(3,list));
    }
}
