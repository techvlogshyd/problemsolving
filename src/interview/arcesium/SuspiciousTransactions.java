package interview.arcesium;

import java.util.*;

public class SuspiciousTransactions {
    public static List<Integer> suspiciousTransactions(List<List<Integer>> transactions){
        List<Integer> result=new ArrayList<>();
        Map<Integer,Integer> transactionDoneOrReceivedBy=new HashMap<>();
        for (List<Integer> transaction:transactions) {
            int transactionId=transaction.get(0);
            int senderId=transaction.get(1);
            int receiverId=transaction.get(2);
            if(!transactionDoneOrReceivedBy.containsKey(senderId)){
                transactionDoneOrReceivedBy.put(senderId,1);
            }
            else{
                transactionDoneOrReceivedBy.put(senderId,transactionDoneOrReceivedBy.get(senderId)+1);
            }
            if(!transactionDoneOrReceivedBy.containsKey(receiverId)){
                transactionDoneOrReceivedBy.put(receiverId,1);
            }
            else if(transactionDoneOrReceivedBy.containsKey(receiverId)&&receiverId!=senderId){
                transactionDoneOrReceivedBy.put(receiverId,transactionDoneOrReceivedBy.get(receiverId)+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : transactionDoneOrReceivedBy.entrySet()) {
            if(entry.getValue()>2){
                result.add(entry.getKey());
            }
        }
    return result;
    }
    public static void main(String[] args) {
        Integer[] transaction1 = {1,1,2};
        Integer[] transaction2 = {2,2,1};
        Integer[] transaction3 = {3,3,3};
        Integer[] transaction4 = {4,3,2};
        System.out.println(suspiciousTransactions(Arrays.asList(Arrays.asList(transaction1),Arrays.asList(transaction2),Arrays.asList(transaction3),Arrays.asList(transaction4))));
    }
}
