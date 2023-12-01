package interview.servicenow;

//9. Given a boolean 2D array of n x m dimensions where each row is sorted.
//        Find the 0-based index of the first row that has the maximum number of 1's.
//        Example 1:
//        Input:
//        N=4, M= 4
//        Arr[][] = (
//        (0, 1, 1, 1),
//        (0, 0, 1, 1),
//        (1, 1, 1, 1),
//        (0, 0, 0, 0))
//        Output: 2
public class MaximumOnes {
    public static void main(String[] args) {
        int[][] input = new int[][]{
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}
        };
        System.out.println(maxOnesAtIndex(input));
    }

    static int maxOnesAtIndex(int[][] input){
        int i = 0;
        int maxOnes = 0;
        int index = 0;
        boolean flag = true;
        while(i < input.length){
            int count = 0;
            for (int j = 0; j < input[i].length; j++) {
                if(input[i][j] == 1){
                    count++;
                    flag = false;
                }
            }
            if(count > maxOnes){
                maxOnes = count;
                index = i;
            }
            i++;
        }
        return flag ? -1 :index;
    }

}
