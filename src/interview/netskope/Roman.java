package interview.netskope;/*
 * Click `Run` to execute the snippet below!
 */

import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named interview.agoda.netskope.Solution.
 *Convert Roman Numerals into integers or vice versa
 * I = 1, II = 2, III = 3, IV = 4, V = 5, VI = 6, VII = 7, VIII = 8, IX =9, X = 10, XI = 11, XII = 12
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
    public static void main(String[] args) {
//        System.out.println( romanToIntegers("VIII"));
        System.out.println(romanToIntegers("IX"));
    }

    public static int romanToIntegers(String input) {
        int sum = 0;
//Taking map practice.general.ds to store all roman chars and respective value of it
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);

//Interate through each character, get its respective integer value and operation to perform
        for (int i = 0; i < input.length(); i++) {
            int valueToConsider = romanValues.get(input.charAt(i));
            //Check if roman I comes before V and X, if so subtract it from respective roman value
            if ((i < input.length() - 1 && input.charAt(i) == 'I' && input.charAt(i + 1) == 'V') || (i < input.length() - 1 && input.charAt(i) == 'I' && input.charAt(i + 1) == 'X')) {
                valueToConsider = romanValues.get(input.charAt(i)) * -1;
            }
            sum = sum + valueToConsider;

        }
        return sum;

    }
}
    /*


1st problem :
  list_1 = [-1,11,10,2,14,13,23,99,101,-8,5]

  Find all pairs of numbers whose sum is perfect square number
  perfect square numbers are : 1,4,9,16, 25 etc
  output = [(-1,10),(11,14)...]
    Skipped..

  2nd probelm:
  lst = [[1,4,5],[7,8,9],[0,0,1],[100,1,200],[80,-1,0],[90,8,100]
  sort the list using 2nd elemement of sub-lists
  output should be another list of sub-lists
  output = [[80,-1,0],[0,0,1],[100,1,200],[1,4,5],[7,8,9],[90,8,100]]



    class interview.agoda.netskope.Solution {
        public static void main(String[] args) {
            List<int[]> input = new ArrayList<>();
            input.add(0, [1,4,5]);
            input.add(1, [7,8,9]);
            sortLists(Arrays.asList());
        }
        public static List sort(List<Integer> input){
            //returns sorted list
            List<Integer> result = new ArrayList<>();
            Collections.sort(result);
            return result;
        }
        public static List<int[]> sortLists(List<int[]> lists){
            List<int[]> result = new ArrayList<>();
            for(int i=0; i< lists.size(); i++){
                if(i==0)
                    result.add(lists.get(0));
                for (int index = 0; index < result.size(); index++) {
                    if(lists.get(i)[1] > result.get(index)[1]){
                        result.add(0, lists.get(i));
                    }
                    else{
                        result.add(result.size()-1, lists.get(i));
                    }
                    System.out.println(result);
                }
            }
            return result;
        }

        public static void sortLists2(List<int[]> lists){
            List<Integer> elementsToSort = new ArrayList<>();
            for (int index = 0; index < lists.size(); index++) {
                elementsToSort.add(lists.get(index)[1]);
            }
            List<Integer> sortedBy2ndElement = sort(elementsToSort);

            //1,2,3,8,8
            for (int index1 = 0; index1 < sortedBy2ndElement.size(); index1++) {
                for (int index2 = 0; index2 < lists.size(); index2++) {
                    if(sortedBy2ndElement.get(index1)==lists.get(index2)[1]){
                        System.out.println(lists.get(index2));
                        break;
                    }
                }
            }


        }
    }



// Your previous Plain Text content is preserved below:

// This is just a simple shared plaintext pad, with no execution capabilities.

// When you know what language you'd like to use for your interview,
// simply choose it from the dots menu on the tab, or add a new language
// tab using the Languages button on the left.

// You can also change the default language your pads are created with
// in your account settings: https://app.coderpad.io/settings

// Enjoy your interview!





}
/*
/*
 * Click `Run` to execute the snippet below!


import java.io.*;
        import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named interview.agoda.netskope.Solution.
 *
 * If you need more classes, simply define them inline.
 */
 /*

1st problem :
  list_1 = [-1,11,10,2,14,13,23,99,101,-8,5]

  Find all pairs of numbers whose sum is perfect square number
  perfect square numbers are : 1,4,9,16, 25 etc
  output = [(-1,10),(11,14)...]
    Skipped..

  2nd probelm:
  lst = [[1,4,5],[7,8,9],[0,0,1],[100,1,200],[80,-1,0],[90,8,100]
  sort the list using 2nd elemement of sub-lists
  output should be another list of sub-lists
  output = [[80,-1,0],[0,0,1],[100,1,200],[1,4,5],[7,8,9],[90,8,100]]



class interview.agoda.netskope.Solution {
    public static void main(String[] args) {
        List<int[]> input = new ArrayList<>();
        input.add(0, [1,4,5]);
        input.add(1, [7,8,9]);
        sortLists(Arrays.asList());
    }
    public static List sort(List<Integer> input){
        //returns sorted list
        List<Integer> result = new ArrayList<>();
        Collections.sort(result);
        return result;
    }
    public static List<int[]> sortLists(List<int[]> lists){
        List<int[]> result = new ArrayList<>();
        for(int i=0; i< lists.size(); i++){
            if(i==0)
                result.add(lists.get(0));
            for (int index = 0; index < result.size(); index++) {
                if(lists.get(i)[1] > result.get(index)[1]){
                    result.add(0, lists.get(i));
                }
                else{
                    result.add(result.size()-1, lists.get(i));
                }
                System.out.println(result);
            }
        }
        return result;
    }

    public static void sortLists2(List<int[]> lists){
        List<Integer> elementsToSort = new ArrayList<>();
        for (int index = 0; index < lists.size(); index++) {
            elementsToSort.add(lists.get(index)[1]);
        }
        List<Integer> sortedBy2ndElement = sort(elementsToSort);

        //1,2,3,8,8
        for (int index1 = 0; index1 < sortedBy2ndElement.size(); index1++) {
            for (int index2 = 0; index2 < lists.size(); index2++) {
                if(sortedBy2ndElement.get(index1)==lists.get(index2)[1]){
                    System.out.println(lists.get(index2));
                    break;
                }
            }
        }


    }
}



 Your previous Plain Text content is preserved below:

 This is just a simple shared plaintext pad, with no execution capabilities.

 When you know what language you'd like to use for your interview,
 simply choose it from the dots menu on the tab, or add a new language
 tab using the Languages button on the left.

 You can also change the default language your pads are created with
 in your account settings: https://app.coderpad.io/settings

 Enjoy your interview!

Preferred Technical Skills

Strong expertise in programming languages like Python.
Strong expertise in RESTful Web Service automation and Day-1 automation readiness.
Strong expertise in cloud technologies like Docker, Kubernetes, Helm etc.
Rich experience in validation of complex systems which includes data pipeline, task queueing, async processing etc.
Should have worked on a cloud based product and have addressed reliability, resiliency and scale related problems
System/server side experience for troubleshooting and strong knowledge of Linux.
Understanding of technologies like Redis, Kafka and NoSQL databases.
Understanding of Active Directory, LDAP, SCIM technologies.
Good working experience in CI/CD tools like Jenkins, Drone and observability tools like ELK, Grafana etc.
Technical know-how of source code systems like Github




 */