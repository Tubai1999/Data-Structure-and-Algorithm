package Stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class NearestSmallerElementFromLeft {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7, 8, 1, 9}; //result = [-1, 3, -1, 2, 7, -1, 1]
//        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        ans[0] = -1;
        stack.push(0);

        for(int i=1;i<arr.length;i++){
            while (!stack.isEmpty()){
                if(arr[stack.peek()] < arr[i]){
                    ans[i] = arr[stack.peek()];
//                    stack.push(i);
                    break;
                }
                else stack.pop();
            }
           if(stack.isEmpty()) ans[i]=-1;
           stack.push(i);
        }

        for (int a: ans) System.out.print(a+" ");
    }
}
