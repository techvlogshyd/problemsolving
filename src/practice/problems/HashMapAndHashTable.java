package practice.problems;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapAndHashTable {
   /*
Hashmap	                        Hashtable
No method is synchronized.	    Every method is synchronized.
Multiple threads can operate simultaneously and hence hashmap’s object is not thread-safe.	At a time only one thread is allowed to operate the Hashtable’s object. Hence it is thread-safe.
Threads are not required to wait and hence relatively performance is high.	It increases the waiting time of the thread and hence performance is low.
Null is allowed for both key and value.	Null is not allowed for both key and value. Otherwise, we will get a null pointer exception.
    */

    public static void main(String[] args) {
        //----------hashtable -------------------------
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(101, " ajay");
        ht.put(101, "Vijay");
        ht.put(102, "Ravi");
        ht.put(103, "Rahul");
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m : ht.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //----------------hashmap--------------------------------
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(104, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        System.out.println("-----------Hash map-----------");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
