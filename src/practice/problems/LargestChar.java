package practice.problems;

public class LargestChar {
    public static void main(String[] args) {
        String str="badTYxXy";
        char temp = 0;
        int tempi;
        for (int i=0;i<str.length();i++){
            for (int j=0;j<str.length();j++){
                if((int)str.charAt(i)>(int)str.charAt(j))
                    temp=str.charAt(i);
                temp=str.charAt(j);
                System.out.println(str.charAt(i)+"***"+str.charAt(j));
            }
        }
        System.out.println(temp);
    }
}
