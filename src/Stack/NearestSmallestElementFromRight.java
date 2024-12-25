package Stack;

import java.util.ArrayDeque;

public class NearestSmallestElementFromRight {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7, 8, 1, 9}; //result = [-1, 3, -1, 2, 7, -1, 1]
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[arr.length];


        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()) ans[i] =-1;
            else ans[i] = stack.peek();
            stack.push(arr[i]);
        }
        for(int a: ans) System.out.print(a+" ");

    }
}
