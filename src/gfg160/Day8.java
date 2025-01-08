package gfg160;

public class Day8 {
    int maxSubarraySum(int[] arr) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Your code here
        for(int a:arr){
            curSum += a;
            if(curSum > maxSum) maxSum = curSum;
            if(curSum < 0) curSum = 0;
        }
        return maxSum;
    }
}
