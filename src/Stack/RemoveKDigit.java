package Stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class RemoveKDigit {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        System.out.println(stack1);
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(5);
        stack.addLast(6);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
