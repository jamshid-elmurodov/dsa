package doubly_linkedlist;

public class DesignBrowserHistory {
    static class Node {
        String val;
        Node prev;
        Node next;

        public Node(String val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private Node curr;

    public BrowserHistory(String homepage) {
        head = new Node(homepage, null, null);
        tail = head;
        curr = head;
    }

    public void visit(String url) {
        curr.next = new Node(url, curr, null);
        curr = curr.next;
        tail = curr;
    }

    public String back(int steps) {
        while (steps > 0 && curr.prev != null){
            curr = curr.prev;
            steps--;
        }

        return curr.val;
    }

    public String forward(int steps) {
        while (steps > 0 && curr.next != null){
            steps--;
            curr = curr.next;
        }

        return curr.val;
    }
}
