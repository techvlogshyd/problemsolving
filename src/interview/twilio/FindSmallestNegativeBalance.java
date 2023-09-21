package interview.twilio;

import java.util.*;

public class FindSmallestNegativeBalance {
    public static List<String> findBalance(List<String> records){
        List<String> result=new ArrayList<>();
        Map<String,Integer> balances= new HashMap<>();
        for (String record:records) {
            String borrower=record.split(" ")[0];
            String lender=record.split(" ")[1];
            int debt=Integer.parseInt(record.split(" ")[2]);
            if(!balances.containsKey(borrower)){
                balances.put(borrower,debt*-1);
            }
            else if(balances.containsKey(borrower)){
                balances.put(borrower,balances.get(borrower)+(debt*-1));
            }
            if(!balances.containsKey(lender)){
                balances.put(lender,debt);
            }
            else if(balances.containsKey(lender)){
                balances.put(lender,balances.get(lender)+debt);
            }
        }
        int smallestNegative=Integer.MAX_VALUE;
        for (Map.Entry<String,Integer> entry : balances.entrySet()) {
            if(entry.getValue()<smallestNegative){
                smallestNegative=entry.getValue();
            }
        }
        for (Map.Entry<String,Integer> entry : balances.entrySet()) {
            if (entry.getValue().equals(smallestNegative)&&entry.getValue()<0) {
                result.add(entry.getKey());
            }
            else{
                result.add("Nobody has a negative balance");
            }
        }
        Collections.sort(result);
    return result;
    }
    public static void main(String[] args) {

        String record1 = "Alex Blake 2";
        String record2 = "Blake Alex 2";
        String record3 = "Casey Alex 5";
        String record4 = "Blake Casey 7";
        String record5 = "Alex Blake 4";
        String record6 = "Alex Casey 4";

        String record7 = "Blake Alex 7";
        String record8 = "Blake Alex 3";
        String record9 = "Alex Blake 4";
        String record10 = "Blake Alex 1";
        String record11 = "Alex Blake 7";

        System.out.println(findBalance(Arrays.asList(record1,record2,record3,record4,record5,record6)));
        System.out.println(findBalance(Arrays.asList(record7,record8,record9,record10,record11)));
    }


}
