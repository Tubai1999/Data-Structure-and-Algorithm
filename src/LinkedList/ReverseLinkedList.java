package LinkedList;


public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = head;
        ListNode cur = head.next;
        head.next = null;
        while(cur != null){
            ListNode next1 = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next1;
        }
        return prev;
    }
}
