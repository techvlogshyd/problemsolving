package practice.problems;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableComparator2 implements Comparable<ComparableComparator2>{
    private int empId;
    private String employeeName;

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public ComparableComparator2(int empId, String employeeName) {
        this.empId=empId;
        this.employeeName=employeeName;
    }
    @Override
    public int compareTo(ComparableComparator2 o) {
        return this.empId-o.empId;
    }
    @Override
    public String toString(){
        return "[Id: "+this.empId+" Name: "+this.employeeName+"]";
    }
    public static Comparator<ComparableComparator2> nameComparator=new Comparator<ComparableComparator2>() {
        @Override
        public int compare(ComparableComparator2 o1, ComparableComparator2 o2) {
            return o1.getEmployeeName().compareTo(o2.getEmployeeName());
        }
    };
}
class sort {
    public static void main(String[] args) {
        ComparableComparator2 employees[]=new ComparableComparator2[4];
        employees[0]=new ComparableComparator2(1,"Prasanna");
        employees[1]=new ComparableComparator2(22,"Prabhat");
        employees[2]=new ComparableComparator2(13,"Yadagiri");
        employees[3]=new ComparableComparator2(4,"Akash");
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
        Arrays.sort(employees,ComparableComparator2.nameComparator);
        System.out.println(Arrays.toString(employees));
        Comparator<ComparableComparator2> sortById=new Comparator<ComparableComparator2>() {
            @Override
            public int compare(ComparableComparator2 o1, ComparableComparator2 o2) {
                return o1.getEmpId()-o2.getEmpId();
            }
        };
        Arrays.sort(employees,sortById);
        System.out.println(Arrays.toString(employees));
    }
}
