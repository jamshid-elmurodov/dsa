package stack;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (String op : ops) {
            switch (op){
                case "C" -> sum -= stack.pop();
                case "D" -> sum += stack.push(stack.peek() * 2);
                case "+" -> {
                    Integer last = stack.pop();
                    Integer peek = stack.peek();

                    stack.push(last);
                    sum += stack.push(peek + last);
                }
                default -> sum += stack.push(Integer.valueOf(op));
            }
        }

        return sum;
    }
}
