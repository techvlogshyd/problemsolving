package practice.javaconceptoftheday;

public class SecondLargest {
    public static void main(String[] args)
    {
        System.out.println(secondLargest(new int[] {45, 51, 28, 75, 49, 42}));

        System.out.println(secondLargest(new int[] {985, 521, 975, 831, 479, 861}));

        System.out.println(secondLargest(new int[] {9459, 9575, 5692, 1305, 1942, 9012}));

        System.out.println(secondLargest(new int[] {47498, 14526, 74562, 42681, 75283, 45796}));

        System.out.println(secondLargest(new int[] { 12, 35, 1, 10, 34, 1 }));

    }

    private static int secondLargest(int[] inputArray) {
        int first=Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > first){
                second = first;
                first = inputArray[i];
            }
            else if (inputArray[i] > second && inputArray[i] != first) {
                second = inputArray[i];
            }
        }
        if(second==Integer.MIN_VALUE)
        {
            System.out.println("There is no second largest");
        }
        else {
            System.out.println("Second largest is :"+second);
        }
    return second;
    }


}
