package LinkedList;

public class IntersectionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0;int sizeB=0;
        ListNode tempA = headA;ListNode tempB = headB;
        while(tempA != null || tempB != null){
            if(tempA != null){
                sizeA++;
                tempA = tempA.next;
            }
            if(tempB != null){
                sizeB++;
                tempB = tempB.next;
            }
        }
        System.out.println(sizeB);
        ListNode temp1 = headA;ListNode temp2 = headB;

        if(sizeA > sizeB){
            for(int i=0;i<sizeA - sizeB;i++){
                temp1 = temp1.next;
            }
            while(temp1 != null && temp2 != null){
                if(temp1 == temp2) return temp1;
                temp1 = temp1.next;temp2 = temp2.next;
            }
        }
        else{
            for(int i=0;i<sizeB - sizeA;i++){
                temp2 = temp2.next;
            }
            while(temp1 != null && temp2 != null){
                if(temp1 == temp2) return temp1;
                temp1 = temp1.next;temp2 = temp2.next;
            }
        }
        return temp1;
    }
}
