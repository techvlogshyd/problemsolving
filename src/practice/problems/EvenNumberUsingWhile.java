package practice.problems;

public class EvenNumberUsingWhile {
    public static boolean isEvenNumber(int number) {
        if (number < 0)
            return false;
        else if (number % 2 == 0)
            return true;
        return false;
    }
    public static int sumEven(int start,int end){
        if (start<=end&&(start>0&&end>0)) {
            int sum = 0;
            int evenFound=0;
            while (start<=end) {
                if (isEvenNumber(start)) {
                    System.out.println("Even no "+start);
                    evenFound++;
                    sum += start;
                }
                start += 1;
            }
            System.out.println("Total even nos"+evenFound);
            return sum;
            }
            return -1;
     }
    public static int sumEven2(int start,int end){
        if (start<=end&&(start>0&&end>0)) {
            int sum = 0;
            int evenFound=0;
            while (start<=end) {
                if (!isEvenNumber(start)) {
                   continue;
                }
                start+=1;
                evenFound++;
                sum+=start;
                System.out.println("Even no"+start);
            }
            System.out.println("Total even nos"+evenFound);
            return sum;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(sumEven(4,20));
        System.out.println(sumEven2(4,20));
    }
}
