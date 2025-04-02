package gfg160.TwoPointer;
import java.util.*;

public class Day63 {
    public int maxLen(int[] arr) {
        // Your code here
        int n = arr.length;
        int ans = 0; int prefixSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i <n;i++){
            prefixSum += (arr[i] == 0 ? -1 :1);

            if(prefixSum == 0) {
                ans = Math.max(ans,i+1);
            }
            else{
                if(map.containsKey(prefixSum)) ans = Math.max(ans,i - map.get(prefixSum));
                else map.put(prefixSum,i);
            }
        }
        return ans;
    }
}
