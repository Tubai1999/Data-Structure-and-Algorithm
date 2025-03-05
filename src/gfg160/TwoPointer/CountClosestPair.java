package gfg160.TwoPointer;
import java.util.*;
public class CountClosestPair {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;

        Arrays.sort(arr);
        int start = 0;
        int end = n-1;
        int minDiff = Integer.MAX_VALUE;
        while(start < end){
            int curVal = arr[start]+arr[end];
            if(Math.abs(curVal-target) < minDiff){
                minDiff = Math.abs(curVal-target);
                ans = List.of(arr[start],arr[end]);
            }

            if(curVal < target) start++;
            else end--;
        }



        return ans;
    }
}
