package practice.problems;

public class Operators {
    public static void main(String[] args) {
        int myIntValue=10+5; //10 nd 5 are operands
        int result=1+2;//= is assignment operator
        result=result*10;
        System.out.println(result);
        result=result/5;
        System.out.println(result);
        result=result%3;
        System.out.println(result);
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result +=2;//result+2
        System.out.println(result);
        result *=2;//result*2
        System.out.println(result);
        result /=2;//result/2
        System.out.println(result);
        result -=2;//result-2
        System.out.println(result);

        //Logical operators
        int topScore=100;
        if (topScore==100){
            System.out.println("High score");
        }
        if (topScore!=100){
            System.out.println("Not High score");
        }
        if (topScore>90){
            System.out.println(">90");
        }
        if (topScore<90){
            System.out.println("<90");
        }
        if (topScore>=90){
            System.out.println(">=90");
        }
        if (topScore<=90){
            System.out.println("<=90");
        }
        int secondTopScore=60;
        if(topScore>secondTopScore && topScore<100){
            System.out.println("Both conditions are true");
        }
        if(topScore>secondTopScore || topScore<100){
            System.out.println("One of the conditions is true");
        }
        boolean isTrue=true;
        if(isTrue == true){
            System.out.println("suppose to happen");
        }
        if(!isTrue){
            System.out.println("Not suppose to happen");
        }
        //ternary operator
        boolean wasApp = isTrue ? true : false;
        System.out.println(wasApp);
        wasApp =  topScore==100?false : true;
        System.out.println(wasApp);
        //https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
        double myDoubleValue=20.00d;
        double myDoubleSecondValue=80.00d;
        double myMultiply=(myDoubleValue+myDoubleSecondValue)*100.00d;
        System.out.println(myMultiply);
        double reminder=myMultiply%40.00d;
        System.out.println(reminder);
        boolean reminder0=reminder==0?true:false;
        System.out.println(reminder0);
        if(!reminder0){
            System.out.println("Some reminder");
        }

    }
}
