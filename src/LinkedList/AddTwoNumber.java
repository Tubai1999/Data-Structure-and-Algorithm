package LinkedList;

public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while(l1 != null || l2 != null || carry ==1){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            ListNode newNode = new ListNode(sum%10);
            carry = sum/10;
            temp.next = newNode;
            temp = temp.next;

        }
        return dummy.next;
    }
}
