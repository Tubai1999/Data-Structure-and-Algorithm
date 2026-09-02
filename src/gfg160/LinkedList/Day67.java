package gfg160.LinkedList;

public class Day67 {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node newHead = null;

        if(head1.data <head2.data){
            newHead = head1;
            head1 = head1.next;
        }
        else{
            newHead = head2;
            head2 = head2.next;
        }

        Node newHeadTemp = newHead;
        while(head1 != null && head2 != null){
            if(head1.data<head2.data){
                newHeadTemp.next = head1;
                head1 = head1.next;
            }
            else{
                newHeadTemp.next = head2;
                head2 = head2.next;
            }
            newHeadTemp = newHeadTemp.next;
        }

        if(head1 != null) newHeadTemp.next = head1;
        if(head2 != null) newHeadTemp.next = head2;

        return newHead;

    }
}
