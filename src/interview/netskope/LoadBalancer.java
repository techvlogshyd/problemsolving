package interview.netskope;

import java.util.*;

public class LoadBalancer {
/*
* https://app.coderpad.io/Y9XWF76A
Pavan K Govindraj 17:00
pkgovindraj@interview.agoda.netskope.com
# Design a load balancer
# input = [10,5,20,45]
# A, B, C
#input -> 10 : A-4,B-3,C-3
#input -> 5 : A-5,B-5, C-5
#condition: max load of 50 , gracefull message to client

 * Click `Run` to execute the snippet below!


 */

    public static void loadBalancer(List<String> nodes, int[] loads, int maxLoad) {
        Map<String, Integer> loadBalancer = new LinkedHashMap<>();
        int totalLoad = 0;
        int loadToAssign = 0;
        int remainingLoad = 0;
        for (int load : loads) {
            if (totalLoad >= maxLoad) {
                System.out.println("Maximum load reached. Load "+ load + " can not be accommodated.");
                break;
            }
            if (load < 0)
                return;
            if ((load / nodes.size()) > maxLoad) {
                loadToAssign = maxLoad / nodes.size();
                remainingLoad = maxLoad - (loadToAssign * nodes.size());
            } else if (load > maxLoad) {
                loadToAssign = maxLoad / nodes.size();
                remainingLoad = maxLoad - (loadToAssign * nodes.size());
            } else {
                loadToAssign = load / nodes.size();
                remainingLoad = load - (loadToAssign * nodes.size());
            }
            for (int i = 0; i < loadToAssign; i++) {
                for (String node : nodes) {
                    if (loadBalancer.containsKey(node)) {
                        loadBalancer.put(node, loadBalancer.get(node) + 1);
                    } else {
                        loadBalancer.put(node, 1);
                    }
                    totalLoad += 1;
                    if (totalLoad >= maxLoad) {
                        System.out.println("Maximum load reached. Load "+ load + " can not be accommodated.");
                        break;
                    }
                }
                if (totalLoad >= maxLoad) {
                    break;
                }
            }

            if (remainingLoad > 0) {
                for (int i = 0; i < remainingLoad; i++) {
                    for (String reloadNode : nodes) {
                        if (remainingLoad > 0 && totalLoad <= maxLoad) {
                            if (totalLoad >= maxLoad) {
                        System.out.println("Maximum load reached. Load "+ load + " can not be accommodated.");
                                break;
                            }
                            loadBalancer.put(reloadNode, loadBalancer.get(reloadNode) + 1);
                            remainingLoad--;
                            totalLoad += 1;
                        } else {
                            break;
                        }
                    }
                    if (totalLoad >= maxLoad) {
                        break;
                    }
                }
            }
        }
        System.out.println(loadBalancer);
    }
    public static void loadBalancer2(List<String> nodes, int[] loads, int maxLoad) {
        Map<String, Integer> loadBalancer = new LinkedHashMap<>();
        int totalLoad = 0;
        int loadToAssign = 0;
        int remainingLoad = 0;
        for (int i = 0; i < loads.length; i++) {
            if (totalLoad >= maxLoad) {
                System.out.println("Maximum load reached. Load "+ loads[i] + " can not be accommodated.");
                break;
            }
            if (loads[i] < 0)
                return;
            if ((loads[i] / nodes.size()) > maxLoad) {
                loadToAssign = maxLoad / nodes.size();
                remainingLoad = maxLoad - (loadToAssign * nodes.size());
            } else if (loads[i] > maxLoad) {
                loadToAssign = maxLoad / nodes.size();
                remainingLoad = maxLoad - (loadToAssign * nodes.size());
            } else {
                loadToAssign = loads[i] / nodes.size();
                remainingLoad = loads[i] - (loadToAssign * nodes.size());
            }
            for (i = 0; i < loadToAssign; i++) {
                for (String node : nodes) {
                    if (loadBalancer.containsKey(node)) {
                        loadBalancer.put(node, loadBalancer.get(node) + 1);
                    } else {
                        loadBalancer.put(node, 1);
                    }
                    totalLoad += 1;
                    if (totalLoad >= maxLoad) {
                        System.out.println("Maximum load reached. Load "+ loads[i] + " can not be accommodated.");
                        break;
                    }
                }
                if (totalLoad >= maxLoad) {
                    break;
                }
            }

            if (remainingLoad > 0) {
                for (i = 0; i < remainingLoad; i++) {
                    for (String reloadNode : nodes) {
                        if (remainingLoad > 0 && totalLoad <= maxLoad) {
                            if (totalLoad >= maxLoad) {
                                System.out.println("Maximum load reached. Load "+ loads[i] + " can not be accommodated.");
                                break;
                            }
                            loadBalancer.put(reloadNode, loadBalancer.get(reloadNode) + 1);
                            remainingLoad--;
                            totalLoad += 1;
                        } else {
                            break;
                        }
                    }
                    if (totalLoad >= maxLoad) {
                        break;
                    }
                }
            }
        }
        System.out.println(loadBalancer);
    }
    public static void main(String[] args) {
        String[] values = {"A", "B", "C"};
        int[] loads = {10, 5, 20, 45};
        loadBalancer(Arrays.asList(values), loads, 50);
    }
}
