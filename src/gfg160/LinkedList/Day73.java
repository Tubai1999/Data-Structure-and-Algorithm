package gfg160.LinkedList;

public class Day73 {
    public static void removeLoop(Node head) {
        // code here
        Node preSlow = null;
        Node slow = head;
        Node fast = head;
        Node temp = head;
        while(fast != null && fast.next != null){
            preSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                while(slow != temp){
                    preSlow = slow;
                    slow = slow.next;
                    temp = temp.next;
                }
                preSlow.next = null;
            }
        }
    }
}
