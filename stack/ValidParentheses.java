package stack;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> map =
                Map.of(')', '(', '}', '{', ']', '[');

        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (map.containsKey(c)){
                if(stack.isEmpty() || map.get(c) != stack.pop())
                    return false;
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
