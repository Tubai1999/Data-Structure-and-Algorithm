package GFG_POTD;
import java.util.*;
public class Feb_24th {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        int n = arr.length;
        for(int i = n-1; i>=0; i--){

            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                list.add(-1);
            }
            else list.add(st.peek());
            st.push(arr[i]);

        }

        Collections.reverse(list);
        return list;}
}
