package practice.neetcode.binarysearch;

public class SearchMatrix {
    public static void main(String[] args) {
        int[][] matrix =new int[][]{{1},{3}};
        System.out.println(searchMatrix(matrix, 3));
        int[][] matrix2 =new int[][]{{1}};
        System.out.println(searchMatrix(matrix2, 0));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int row = 0;
        boolean rowPresent = false;
        while (row < matrix.length){
            if(target >= matrix[row][0] && target <= matrix[row][matrix[0].length-1]){
                rowPresent = true;
                break;
            }
            row++;
        }
        if (!rowPresent){
            return false;
        }
        int left = 0, right = matrix[0].length-1;
        while(left <= right){
            int mid = left + ((right - left)/2);
            if(target < matrix[row][mid]){
                right = mid - 1;
            }
            else if(target > matrix[row][mid]){
                left = mid + 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
