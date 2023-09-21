package practice.problems;

public class Recurssion {
    static Integer func(int a, int b) {
        if(b==0)
            return 1;
        Integer temp = func(a,b/2);
        if(b%2!=0)
            return temp * temp * a;
        else
            return temp * temp;
    }

    /*
    * 3,0->1
    * 3,2->
    * 3,1->
    *
    *
    *
    *
    * */

    public static void main(String[] args) {
        System.out.println(func(3,5));
    }
}
