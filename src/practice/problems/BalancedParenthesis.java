package practice.problems;

import java.util.*;

public class BalancedParenthesis {
    static boolean areBracketsBalanced(String expr)
    {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
                = new ArrayDeque<Character>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }
public static List<String> checkBalancedParenthesis(List<String> input){
       // Stack<String> stack1 = new Stack<>();
    List<String> result=new ArrayList<>();
    for (int i=0;i<input.size();i++)
    {
        Deque<Character> stack=new ArrayDeque<>();
        for (int j=0;j<input.get(i).length();j++)
        {
            if (input.get(i).charAt(j)=='{'||input.get(i).charAt(j)=='('||input.get(i).charAt(j)=='[') {
                stack.push(input.get(i).charAt(j));
            }
            else{
                switch (input.get(i).charAt(j))
                {
                    case '}':
                        if (stack.peek()!='('&&stack.peek()!='[')
                            stack.pop();
                        break;
                    case ')':
                        if (stack.peek()!='{'&&stack.peek()!='[')
                            stack.pop();
                        break;
                    case ']':
                        if (stack.peek()!='('&&stack.peek()!='{')
                            stack.pop();
                        break;
                }
            }
        }
        if (stack.isEmpty())
            result.add("YES");
        else
            result.add("NO");
    }
    return result;
}
    // Driver code
    public static void main(String[] args)
    {
        String expr = "([{}])";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
        System.out.println(checkBalancedParenthesis(Arrays.asList(new String[]{"{}()[]", "{}","[}","{([])}","{([[)}","{([])}({[]})[({})]"})));
    }
}
