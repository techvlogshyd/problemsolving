package practice.problems;

class Alpha {
    static String s="";
    protected Alpha(){
        s+="alpha ";
    }
}
class SubAlpha extends Alpha{
    private SubAlpha(){
        s+="sub";
    }
}
public class SubSubAlpha extends Alpha{
    private SubSubAlpha (){
        Alpha.s+="subsub ";
    }

    public static void main(String[] args) {
        new SubSubAlpha();
        System.out.println(Alpha.s);
    }
}

