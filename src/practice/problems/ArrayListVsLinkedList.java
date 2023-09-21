package practice.problems;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        //Faster retrieval of values
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Prasanna");
        arrayList.add("Kumar");
        arrayList.add("Modugu");
        arrayList.add("Modugu");//Duplicates allowed
        System.out.println(arrayList.get(1));//faster, gets the value directly from that index
        System.out.println(arrayList);

        //Best for adding and removing elements
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Prasanna");
        linkedList.add("Kumar");
        linkedList.add("Modugu");
        linkedList.add("Modugu");//Duplicates allowed
        System.out.println(linkedList.get(1));//slower, gets the value by traversing each element from start
        linkedList.add(1,"new value inserted");
        System.out.println(linkedList);

    }
}
