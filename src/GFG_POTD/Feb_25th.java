package GFG_POTD;
import java.util.*;

public class Feb_25th {
    public static int getMaxArea(int arr[]) {
        // your code here
        int[] prevArr = prevSmaller(arr);
        int[] nextArr = nextSmaller(arr);

        int ans = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int width = nextArr[i]-prevArr[i]-1;
            ans  = Math.max(width*arr[i],ans);
        }
        return ans;

    }

    static int[] prevSmaller(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }

    static int[] nextSmaller(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) ans[i] = n;
            else ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
}
