package interview.arcesium;


import java.util.ArrayList;
import java.util.List;

/*
*1. Application Manager
Implement an application manager to handle three commands given as strings.
﻿﻿﻿"open x": Open application x.
﻿﻿﻿"close k": Close the k most recently opened applications. If there are kor fewer applications open, close them all.
﻿﻿﻿"clear": Close all open applications.
Given an array of commands, return the list of open applications after execution. The ids should be in the order they were opened.
Example
commands = ["open firefox", "open terminal", "open curl", "close 2",
"open ps"]
Currently Open
Applications
Command
After Command
Execution

"open firefox"
["firefox"]
["firefox"]
"open terminal"
["firefox", "terminal"]
["firefox", "terminal"]
"open curl"
["firefox", "terminal",
"curl"]
['"firefox", "terminal",
"curl"]
"close 2"
['firefox"]
["firefox"]
"open ps"
"firefox", "ps"]
Hence the answer is ["firefox", "ps"].
Function Description
Complete the function getOpenApplications in the editor below.
 */
public class ApplicationManager {
    public static void main(String[] args) {
        String[] commands = {"open firefox", "open terminal", "open curl", "close 2", "open ps"};
        List<String> result = getOpenApplications(commands);
        System.out.println(result);
    }
    public static List<String> getOpenApplications(String[] commands) {
        List<String> openedApps = new ArrayList<>();

        for (String command : commands) {
            String[] parts = command.split(" ");
            String action = parts[0];

            switch (action) {
                case "open" -> {
                    String appToOpen = parts[1];
                    openedApps.add(appToOpen);
                }
                case "close" -> {
                    int numToClose = Integer.parseInt(parts[1]);
                    if (numToClose < openedApps.size()) {
                        for (int i = 0; i < numToClose; i++) {
                            openedApps.remove(openedApps.size() - 1);
                        }
                    } else {
                        openedApps.clear();
                    }
                }
                case "clear" -> openedApps.clear();
            }
        }

        return openedApps;
    }
}
