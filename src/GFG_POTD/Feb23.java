package GFG_POTD;
import java.util.*;

public class Feb23 {
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
        return list;


        // code here
        // ArrayList<Integer> listAns = new ArrayList<>();
        // int n = arr.length;
        // for(int i = 0;i<n;i++){
        //     int compareVal = -1;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i] < arr[j]) {
        //             compareVal = arr[j];
        //             break;
        //         }
        //     }
        //     listAns.add(compareVal);
        // }
        // return listAns;
    }
}
