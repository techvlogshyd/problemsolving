package interview.twilio;

import java.util.Arrays;
import java.util.List;

public class WareHouse {
    /*
  1. Innovative things (Challenges you faced, fixes and results)
  2. Grep command
  3. Test scenarios Unit tests, Integration tests, system tests and complex tests

   Situation. What was the situation you or your previous employer faced?
    Task. What tasks were involved?
    Action. What actions did you take?
    Results. What were the results of those actions?”

    Go through https://www.twilio.com/docs/labs/dev-phone

    Sample robot program https://www.geeksforgeeks.org/position-of-robot-after-given-movements/

Imagine there a 2 dimensional warehouse of size (x,y) x length and y height which contains boxes

x:6  y:5 Warehouse

[ 0 0 0 0 0 0 ]
[ 0 0 0 0 0 0 ]
[ 0 0 0 0 0 0 ] Height
[ 0 0 0 0 0 0 ]
[ 0 0 0 0 0 0 ]
    Length
[ 0 1 2 3 4 5 ]  Positions

There is a robotic arm which can grab boxes from an infinite stash and drop them in one of the positions of the warehouse

The robot understands the commands 'P', 'M' and 'L':
P: Pickup from the stack and move the robot to position 0
M: Move to the next position to the right
L: Lower the block

Input
Size of the warehouse length, height and the list of instructions to be processed in a string

Output
An array of the list of positions with the number of blocks in them

Example for a (6,5) warehouse
Input       Output
P      ->   [ 0 0 0 0 0 0 ]
PL       -> [ 1 0 0 0 0 0 ]
PML      -> [ 0 1 0 0 0 0 ]
PLPLPL   -> [ 3 0 0 0 0 0 ]
PMMML    -> [ 0 0 0 1 0 0 ]
PMMMMML  -> [ 0 0 0 0 0 1 ]
Input                       Output
PLPMLPLPLPLPMMMLPMMMMML -> [ 4 1 0 1 0 1 ]

1. Is it like the first instruction should be executed at height 1, second instruction at height 2?
2. What if instruction going beyond warehouse length, example warehouse length is 2 and instruction is PMMML
3. List of total boxes in each column
*/

    public static int[] getListOfPositionsWithNoOfBlocks(int length, int height, String commandList[]) {
        int[] result = new int[length];
        int[][] wareHouse = new int[height][length];
        for (int i=0; i<commandList.length;i++) {
            char[] command = commandList[i].toCharArray();
            int index1 = i, index2 = 0;
            for (char ch : command) {
                if (ch == 'P') {
                    index1 = i;
                    index2 = 0;
                } else if (ch == 'M') {
                    index2++;
                } else {
                    wareHouse[index1][index2] += 1;
                    result[index2]++;
                }
            }
        }
        System.out.println(Arrays.deepToString(wareHouse));
        return result;
    }
    public static int[] getListOfTotalBoxesInEachColumn(int length, int height, String instructionList[]) {
        //Handle instructions length
        if (instructionList.length>height){
           System.out.println("Instructions from position "+height+" won't be executed");
        }

        //Store each column sum
        int[] result = new int[length];

        //Construct warehouse (2 dimensional array) with given height and length
        int[][] wareHouse = new int[height][length];

        //Store list of valid commands in a list to validate each character in given instruction is valid or not
        List<Character> validCommands=Arrays.asList(new Character[]{'P', 'M', 'L'});

        //Iterate till given height of warehouse starting from zero
        for (int i=0; i<height;i++) {

            //Get all commands in each instruction at position i
            char[] instruction = instructionList[i].toCharArray();

            //Reset row height and column after each instruction
            int rowHeight = i, column = 0;

            //Reset lower to avoid previous state
            boolean lower=false;

            //Iterate each command of ith instruction
            for (char command : instruction) {

                //Check the instruction is valid, and it starts with 'P'
                if(validCommands.contains(command) && instructionList[i].charAt(0)=='P') {

                    //Set current position at ith row and 0 column, and reset lower for next execution of L command
                    if (command == 'P') {
                        rowHeight = i;
                        column = 0;
                        lower=false;
                    }

                   //Move column to right by +1, and make sure it's always within the given length
                    else if (command == 'M' && column < length) {
                        column++;
                    }

                   //Update warehouse position and result by +1, and update lower to avoid consecutive L's
                    else if (command == 'L' && column < length && lower == false) {
                        wareHouse[rowHeight][column] += 1;
                        result[column]++;
                        lower=true;
                    }

                    //Handle invalid command and reset column to '0'
                    else {
                        column = 0;
                        System.out.println("Invalid command "+command+" in "+instructionList[i]);
                    }
                }

                //Handle Invalid instruction
                else{
                    System.out.println("Invalid instruction "+instructionList[i]);
                    break;
                }
            }
        }
        System.out.println(Arrays.deepToString(wareHouse));
        return result;
    }
    public static void main(String[] args) {
        int length=6, height=6;
        System.out.println(Arrays.toString(getListOfPositionsWithNoOfBlocks(length,height,new String[]{"P","PL","PML","PLPLPL","PMMML","PMMMMML"})));
        System.out.println(Arrays.toString(getListOfTotalBoxesInEachColumn(length,height,new String[]{"P","PL","PML","PLPLPL","PMMML","PMMMMML"})));
        System.out.println(Arrays.toString(getListOfTotalBoxesInEachColumn(length,height,new String[]{"P","PL","PMLLL","PLPLPL","PMMML","PMMMMML"})));
        System.out.println(Arrays.toString(getListOfTotalBoxesInEachColumn(length,height,new String[]{"P","PL","PML","PLPLPL","PMMML","PMMMMMMMML"})));
        System.out.println(Arrays.toString(getListOfTotalBoxesInEachColumn(length,height,new String[]{"P","PL","PML","PLPLPL","PMMML","XMMMMMMMML"})));
        System.out.println(Arrays.toString(getListOfTotalBoxesInEachColumn(length,height,new String[]{"P","PL","PML","PLPLPL","PMMML","PLPLPL","PLPLPL"})));
    }



}
