package LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        Node newHead = insertInSpecificPos(0,5,head);
        printLinkedList(newHead);
        System.out.println();
        Node newHead1 = DeleteSpecificPos(1,newHead);
        printLinkedList(newHead1);
    }
    static void printLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+"-> ");
            temp = temp.next;
        }
    }
    static Node insertInSpecificPos(int pos,int val,Node head){
        Node temp = head;
        Node newNode = new Node(val);
        if(pos==0) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    static  Node DeleteSpecificPos(int pos,Node head){
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
