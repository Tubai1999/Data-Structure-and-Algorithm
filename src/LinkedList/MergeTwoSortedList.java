package LinkedList;



public class MergeTwoSortedList {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        Node newHead = null;
        if (head1.val < head2.val) {
            newHead = head1;
            head1 = head1.next;
        } else {
            newHead = head2;
            head2 = head2.next;
        }
        Node tempNewHead = newHead;

        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                if(tempNewHead==null) tempNewHead=head1;
                else tempNewHead.next = head1;
                head1 = head1.next;
            }
            else{
                if(tempNewHead==null) tempNewHead=head2;
                else tempNewHead.next = head2;
                head2 = head2.next;
            }
            tempNewHead = tempNewHead.next;
        }

        if(head1 != null) tempNewHead.next = head1;
        if(head2 != null) tempNewHead.next = head2;

        return newHead;
    }
}
