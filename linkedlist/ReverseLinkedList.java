package linkedlist;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        ListNode res = new ListNode(head.val);

        for(ListNode x = head.next; x != null; x = x.next){
            res = new ListNode(x.val, res);
        }

        return res;
    }
}
