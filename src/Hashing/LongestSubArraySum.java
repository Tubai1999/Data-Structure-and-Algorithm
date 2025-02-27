package Hashing;

import java.util.HashMap;

public class LongestSubArraySum {


    static int findLongSum(int[] arr, int k){
        int maxLen = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        int curSum = 0;
        for(int i = 0; i<n; i++){
            curSum += arr[i];
            if(curSum == k){
                maxLen = Math.max(maxLen,i+1);
            }
            if(map.containsKey(k-curSum)){
                maxLen = Math.max(maxLen,i - map.get(k-curSum));
            }
            if(!map.containsKey(curSum)){
                map.put(curSum,i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(findLongSum(arr,15));
    }
}
