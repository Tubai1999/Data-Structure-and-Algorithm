package gfg160.TwoPointer;
import java.util.*;

public class SubArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        int start = 0; int curSum = 0;
        for(int end = 0; end<n; end++){
            curSum += arr[end];
            while(curSum > target){
                curSum -= arr[start];
                start++;
            }

            if(curSum == target){
                ans.add(start+1);
                ans.add(end+1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}
