package gfg160.LinkedList;

public class Day65 {

    Node reverseLiskedList(Node head){
        Node prev = null;
        Node cur = head;
        while (cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

}

class Node{
    Node next;
    int data;
    Node(int value){
        data = value;
    }
}
