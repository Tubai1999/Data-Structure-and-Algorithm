package Queue;

import java.util.ArrayDeque;

public class QueueUsingOneStack {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        helper(stack,1);
        helper(stack,2);
        helper(stack,3);
        helper(stack,4);

        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);

    }

    static void helper(ArrayDeque<Integer> stack,int val){
        if(stack.isEmpty()){
            stack.push(val);
            return;
        }
        int temp = stack.pop();
        helper(stack,val);
        stack.push(temp);
    }
}
