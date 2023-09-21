package practice.general.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployee {
    public static void main(String[] args) {
        List<Employee> emps=new ArrayList<>();
        emps.add(new Employee("Prasanna",1000000,777));
        emps.add(new Employee("Kumar",10000000,999));
        emps.add(new Employee("Modugu",5000000,888));
        Collections.sort(emps);
        System.out.println(emps);
        Collections.sort(emps,new SortByName());
        System.out.println(emps);
    }
}
