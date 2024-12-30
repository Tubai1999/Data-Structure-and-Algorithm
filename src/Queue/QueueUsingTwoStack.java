package Queue;

import java.util.ArrayDeque;

public class QueueUsingTwoStack {
    public static ArrayDeque<Integer> stack1;
    public static ArrayDeque<Integer> stack2;
    public static void main(String[] args) {
         stack1 = new ArrayDeque<>();
         stack2 = new ArrayDeque<>();
    }

    static void enqueue(int data){
        stack1.push(data);
    }
    static int dequeue(){
        if(stack1.isEmpty() && stack2.isEmpty()) return -1;
        if(!stack2.isEmpty()) return stack2.pop();
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
