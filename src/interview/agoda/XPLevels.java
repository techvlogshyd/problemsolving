package interview.agoda;

import java.util.*;

public class XPLevels {
    public static String[] solution(int[] points) {
        // Define the level ranges and names
        String[] levels = {"Recruit", "Soldier", "Warrior", "Captain", "Ninja"};
        int[] ranges = {1000, 5000, 10000, 50000};

        // Create a map to store the count of users in each level
        Map<String, Integer> levelCountMap = new HashMap<>();

        // Initialize level count map
        for (String level : levels) {
            levelCountMap.put(level, 0);
        }

        // Count users in each level
        for (int point : points) {
            String level = "Ninja"; // Default level
            for (int i = 0; i < ranges.length; i++) {
                if (point < ranges[i]) {
                    level = levels[i];
                    break;
                }
            }
            levelCountMap.put(level, levelCountMap.get(level) + 1);
        }

        // Create a list to store the result strings
        List<String> result = new ArrayList<>();

        // Iterate through the level count map and add entries to the result list
        for (String level : levels) {
            int count = levelCountMap.get(level);
            if (count > 0) {
                result.add(level + " - " + count);
            }
        }

        // Sort the result list in decreasing order of user count
        Collections.sort(result, (a, b) -> {
            int countA = Integer.parseInt(a.split(" - ")[1]);
            int countB = Integer.parseInt(b.split(" - ")[1]);
            if (countA != countB) {
                return countB - countA;
            } else {
                return Arrays.asList(levels).indexOf(b.split(" - ")[0]) -
                        Arrays.asList(levels).indexOf(a.split(" - ")[0]);
            }
        });

        // Convert the result list to an array and return
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        int[] points = {1500, 8000, 12000, 75000, 2000, 75000};
        String[] result = solution(points);
        for (String entry : result) {
            System.out.println(entry);
        }
    }
}
