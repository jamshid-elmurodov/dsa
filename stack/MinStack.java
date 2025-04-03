package stack;

class MinStack {
    static class Node {
        int value;
        Node next;
        Node prev;
        int min;

        public Node(int value, Node next, Node prev, int min) {
            this.value = value;
            this.next = next;
            this.prev = prev;
            this.min = min;
        }
    }

    Node stack;

    public MinStack() {}

    public void push(int val) {
        if (stack == null){
            stack = new Node(val, null, null, val);
        } else {
            stack.next = new Node(val, null, stack, Math.min(val, stack.min));
            stack = stack.next;
        }
    }

    public void pop() {
        stack = stack.prev;
    }

    public int top() {
        return stack.value;
    }

    public int getMin() {
        return stack.min;
    }
}