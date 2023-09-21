package practice.neetcode.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board2= new char[][] {
        {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
       
        char[][] board = new char[][] {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        System.out.println(isValidSudoku(board));
        System.out.println(isValidSudoku(board2));
        System.out.println(isValidSudoku2(board));
        System.out.println(isValidSudoku2(board2));
    }
    public static boolean isValidSudoku(char[][] board){
        Set<Character> rowSet = null;
        Set<Character> colSet = null;
        for (int i = 0; i < 9; i++) {
            rowSet = new HashSet<>();
            colSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if(board[i][j] != '.'){
                    if (rowSet.contains(board[i][j])){
                        return false;
                    }
                    rowSet.add(board[i][j]);
                }
                if(board[j][i] != '.'){
                    if (colSet.contains(board[j][i])){
                        return false;
                    }
                    colSet.add(board[j][i]);
                }
            }
        }
        for (int i = 0; i < 9; i = i+3) {
            for (int j = 0; j < 9; j = j+3) {
                if (!checkBlock(board, i, j)){
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean checkBlock(char[][] board, int idxI, int idxJ){
        Set<Character> blockSet = new HashSet<>();
        int rows = idxI+3;
        int cols = idxJ+3;
        for (int i = idxI; i < rows; i++) {
            for (int j = idxJ; j < cols; j++) {
                if (board[i][j] == '.'){
                    continue;
                }
                if (blockSet.contains(board[i][j])){
                    return false;
                }
                blockSet.add(board[i][j]);
            }
        }
        return true;
    }
    public static boolean isValidSudoku2(char[][] board) {
        Set<Character> rowSet = null;
        Set<Character> colSet = null;
        for(int i = 0; i < 9; i++){
            rowSet = new HashSet<>();
            colSet = new HashSet<>();
            for(int j =0; j < 9 ; j++){
                if(board[i][j] != '.'){
                    if(rowSet.contains(board[i][j])){
                        return false;
                    }
                    rowSet.add(board[i][j]);
                }
                if(board[j][i] != '.'){
                    if(colSet.contains(board[j][i])){
                        return false;
                    }
                    colSet.add(board[j][i]);
                }
            }
        }
        for(int i =0; i < 9; i = i+3){
            for(int j = 0; j < 9; j = j+3){
                if(!checkBlock2(board, i, j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkBlock2(char[][] board, int idxI, int idxJ){
        Set<Character> blockSet = new HashSet<>();
        int rows = idxI + 3;
        int cols = idxJ + 3;
        for(int i = idxI; i < rows; i++){
            for(int j = idxJ; j < cols; j++){
                if(board[i][j] != '.'){
                    if(blockSet.contains(board[i][j])){
                        return false;
                    }
                    blockSet.add(board[i][j]);
                }
            }
        }
        return true;
    }
}
