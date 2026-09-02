package gfg160.TwoPointer;
import java.util.*;
public class CountPair {
    int countPairs(int arr[], int target) {
        // Your code here
        int ans = 0;
        int n = arr.length;
        Arrays.sort(arr);
        int start = 0;
        int end = n-1;
        while(start<end){
            if(arr[start]+arr[end] < target){
                ans += (end-start);
                start++;
            }
            else end--;
        }
        return ans;
    }
}
