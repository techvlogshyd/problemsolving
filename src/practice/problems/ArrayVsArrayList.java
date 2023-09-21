package practice.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        String[] array={"Prasanna","Kumar", "Modugu","PM"};
        ArrayList<String> arrayList=new ArrayList<>(Arrays.asList("Prasanna","Kumar", "Modugu","PM"));

        //get element
        System.out.println(array[0]);
        System.out.println(arrayList.get(0));

        //get length
        System.out.println(array.length);
        System.out.println(arrayList.size());

        //set element
        array[0]="array updated";
        System.out.println(array[0]);
        arrayList.set(0,"arrayListUpdated");
        System.out.println(arrayList.get(0));

        //remove- can't be done with array
        arrayList.remove("Kumar");
        System.out.println(arrayList.get(1));

        //print- A loop should be used to get elements of array
        System.out.println(array);
        System.out.println(arrayList);






    }
}
