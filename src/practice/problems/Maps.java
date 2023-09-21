package practice.problems;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,Integer> emps=new HashMap<>();
        emps.put("Prasanna",12345);
        emps.put("Kumar",77777);
        emps.put("Modugu",99999);
        System.out.println(emps);
        emps.put("Modugu",88888);//Value will be replaced with new
        System.out.println(emps);
        emps.replace("Modugu",66666);
        System.out.println(emps.containsKey("Prasanna"));
        System.out.println(emps.containsValue(66666));
        emps.putIfAbsent("Kumar1",33333);
        System.out.println(emps);
    }

}
