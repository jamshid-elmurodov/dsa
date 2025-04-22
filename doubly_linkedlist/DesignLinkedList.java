package doubly_linkedlist;

public class DesignLinkedList {
    static class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public int get(int index) {
        Node copy = head;

        for (int i = 0; i < index; i++) {
            copy = copy.next;
        }

        return copy.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val, null, head);
        if (head != null) head.prev = newNode;
        head = newNode;
        if (size == 0) tail = newNode;
        size++;
    }

    public void addAtTail(int val) {
        if (size == 0) {
            head = new Node(val, null, null);
            tail = head;
        } else {
            tail.next = new Node(val, tail, null);
            tail = tail.next;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        Node newNode = new Node(val, curr.prev, curr);
        curr.prev.next = newNode;
        curr.prev = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            if (size == 1) tail = null;
        } else if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            Node curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
        }

        size--;
    }
}
