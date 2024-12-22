package Stack;
import java.util.*;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] stocks = {100,80,60,70,60,75,85};
        int n = 7;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        int[] ans = new int[n];
        ans[0] = 1;
        for(int i=1;i<n;i++){
            while(!stack.isEmpty() && stocks[i] >= stocks[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = i+1;
            }
            else {
                ans[i] = i - stack.peek();
            }
            stack.push(i);
        }

        for(int a: ans){
            System.out.print(a+" ");
        }

    }
}
