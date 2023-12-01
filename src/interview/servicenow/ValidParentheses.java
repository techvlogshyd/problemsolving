package interview.servicenow;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("()}"));
    }
    static boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketLookup = new HashMap<>();
        bracketLookup.put(')', '(');
        bracketLookup.put(']', '[');
        bracketLookup.put('}', '{');
        for(char ch : s.toCharArray()){
            if(bracketLookup.containsKey(ch)){
                if(!brackets.isEmpty() && bracketLookup.get(ch) == brackets.peek()){
                    brackets.pop();
                }
                else{
                    return false;
                }
            }
            else{
                brackets.push(ch);
            }
        }
        return brackets.isEmpty();
    }
}
