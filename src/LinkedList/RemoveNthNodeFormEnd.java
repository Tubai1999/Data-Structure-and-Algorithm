package LinkedList;

public class RemoveNthNodeFormEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz = findSizeOfList(head);
        ListNode temp = head;
        for(int i=0;i<sz-n-1;i++){
            temp = temp.next;
        }
        if(sz == n) return head.next;
        temp.next = temp.next.next;
        return head;
    }

    int findSizeOfList(ListNode head){
        int sz = 0;
        while(head != null){
            sz++;
            head = head.next;
        }
        return sz;
    }
}
