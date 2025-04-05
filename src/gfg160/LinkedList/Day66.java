package gfg160.LinkedList;

public class Day66 {
    public Node rotate(Node head, int k) {
        // add code here
        Node temp = head;
        int length = 1;

        while(temp.next != null){
            temp = temp.next;
            length++;
        }

        k = k%length;
        if(k == 0) return head;
        temp.next = head;
        int stepToHead = k;
        Node newTail = head;
        while(stepToHead-->1){
            newTail = newTail.next;
        }
        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;

    }
}
