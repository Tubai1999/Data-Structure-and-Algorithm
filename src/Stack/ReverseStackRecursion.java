package Stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStackRecursion {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }

    static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()) return;
        int temp = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack,temp);
    }

    static void insertAtBottom(Stack<Integer> stack,int newVal){
        if(stack.isEmpty()) {
            stack.push(newVal);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(stack,newVal);
        stack.push(temp);
    }
}
