package interview.arcesium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthenticationTokens {
    /*
    * when users are authenticated they are given an authentication token. Unless a token is reset, it expires after a system wide expiryLimit, If a reset request is received at or before the expiryLimit minutes from the tome of reset.

1. An unexpired token_id can be reset any number of times.
2. A reset issued to a non existent or expired token_id is ignored
3. Once token_id expires it cannot be reused

Command syntex [type, token_id, T]
	Create command: Type 0 generates a token with token_id at time T, it expiry is set to T+expiryLimit
	Reset command: Type 1 resets the expiry to T+expiryLimit
Example
expiryLimit =4
commands= [[0,1,1],[0,2,2],[1,1,5],[1,2,7]]

The maximum time T=7, so the analysis will end at time T=7. Each time a token is created or reset, its new expiration time will be at time T+4

Working through the commands

0. [0,1,1]: Create token_id=1 at time T=1 and set its expiry to T+expiryLimit=5
1. [0,2,2]: Create token_id=2 at time T=2 and set its expiry to T+expiryLimit=6
2. [1,1,5]: Reset token_id=1 at T=5, The time is less than or equal to expiry limit so a new limit is set 5+4=9
3. [1,2,7]: Rest token_id =2 at T=7, The id expires at time T=6, so when the reset token_id=2 command comes in at T=7, it is ignored

Only token_id =1 is active at time T=7, return 1.

Function Description
Complete the numberOfTokens function has following parameters
int expiryLimit: The expiry limit of each token
int commands[n][3] each command[i] has 3 integers: [command, token_id,T]

Constraints
int:number of commands that exist at the end of the command array is sorted ascending by T (commands[i][2])
1<=expiryLimit<10^8
1<=token_id<10^8
1<=T<10^8

Sample case
expiryLimit =3
[[0,1,1][1,1,5]]
o/p 0
expiryLimit 3
[[0,1,1][1,1,4][1,2,5]]
o/p 1
    * */

    public static int numberOfTokens(int expiryLimit,List<List<Integer>> commands){
        Map<Integer,Integer> tokenExpiry=new HashMap<>();
        for (List<Integer> command:commands) {
            int commandType=command.get(0);
            int token_id=command.get(1);
            int time=command.get(2);
            if (commandType==0){
                tokenExpiry.put(token_id,expiryLimit+time);
            }
            else if(tokenExpiry.containsKey(token_id)){
                if(time<=tokenExpiry.get(token_id)){
                    tokenExpiry.put(token_id,expiryLimit+time);
                }
                else{
                    tokenExpiry.remove(token_id);
                }
            }

        }
        return tokenExpiry.size();
    }
    public static void main(String[] args) {
        Integer[] command1 = {0,1,1};
        Integer[] command2 = {1,1,4};
        Integer[] command3 = {1,2,5};

        Integer[] command4 = {0,1,1};
        Integer[] command5 = {1,1,5};

        Integer[] command6 = {0,1,1};
        Integer[] command7 = {0,2,2};
        Integer[] command8 = {1,1,5};
        Integer[] command9 = {1,2,7};

//        System.out.println(numberOfTokens(3,Arrays.asList(Arrays.asList(command1),Arrays.asList(command2),Arrays.asList(command3))));
//        System.out.println(numberOfTokens(3,Arrays.asList(Arrays.asList(command4),Arrays.asList(command5))));
        System.out.println(numberOfTokens(4,Arrays.asList(Arrays.asList(command6),Arrays.asList(command7),Arrays.asList(command8),Arrays.asList(command9))));
    }

}
