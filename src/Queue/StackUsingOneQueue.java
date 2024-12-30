package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {
    static Queue<Integer> q;
    public static void main(String[] args) {
         q = new LinkedList<>();
    }
    static void push(int val){
        q.offer(val);
    }

    static int pop(){
        if(q.isEmpty()){
            System.out.println("it's empty noting to delete");
            return -1;
        }
        for(int i=0;i<q.size();i++){
            q.offer(q.poll());
        }
        return q.poll();
    }
}
