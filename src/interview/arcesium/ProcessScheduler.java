package interview.arcesium;

import java.util.Arrays;

/*
*
* 12. Process Scheduler
Process scheduling algorithms are used by a CPU to optimally schedule the running processes. A core can execute one process at a time, but a CPU may have multiple cores.
There are n processes where the ith process starts its execution at startli] and ends at end[i], both inclusive. Find the minimum number of cores required to execute the processes.
Example
n =3
start = [1, 3, 4]
end = [3, 5, 6].
If the CPU has only one core, the first process starts at 1 and ends at
3. The second process starts at 3. Since both processes need a processor at 3, they overlap. There must be more than 1 core.
If the CPU has two cores, the first process runs on the first core from 1 to 3, the second runs on the second core from 3 to 5, and the third process runs on the first core from 4 to 6.
Return 2, the minimum number of cores required.
Function Description
Complete the function getMinCores in the editor below.
getMinCores takes the following arguments: int start[n]: the start times of processes int end[n]: the end times of processes
Returns
int: the minimum number of cores required
* */
public class ProcessScheduler {
    public static int getMinCores(int[] start, int[] end) {
        int n = start.length;

        int[] events = new int[2 * n];
        for (int i = 0; i < n; i++) {
            events[2 * i] = start[i];
            events[2 * i + 1] = end[i];
        }

        Arrays.sort(events);

        int cores = 0;
        int maxCores = 0;

        for (int event : events) {
            if (event == start[cores]) {
                cores++;
            } else {
                cores--;
            }

            maxCores = Math.max(maxCores, cores);
        }

        return maxCores;
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 4};
        int[] end = {3, 5, 6};

        int result = getMinCores(start, end);
        System.out.println("Minimum number of cores required: " + result);
    }
}
