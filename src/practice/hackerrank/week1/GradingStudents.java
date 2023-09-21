package practice.hackerrank.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
//        Integer[] values = {0,0,1,2,1};
        Integer[] values = {73,67,38,33};
        System.out.println(gradingStudents(Arrays.asList(values)));
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result=new ArrayList<>();
        for (Integer grade : grades) {
            if(grade<38){
                result.add(grade);
            }
            else {
                int remainder=grade%5;
                int toBeRoundedTo=grade+(5-remainder);
                if((toBeRoundedTo-grade)<3) {
                    result.add(toBeRoundedTo);
                }
                else{
                    result.add(grade);
                }
            }
        }
        return result;
    }
}
