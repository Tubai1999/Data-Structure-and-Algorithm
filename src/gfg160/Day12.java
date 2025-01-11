package gfg160;

public class Day12 {
    public int circularSubarraySum(int arr[]) {

        // Your code here
        int totalSum = 0;
        for(int a:arr) totalSum += a;

        int maxSum = maxSumUsingKaden(arr);

        int minSum = minSumUsingKaden(arr);

        int circularSum = totalSum - minSum;

        if(maxSum < 0) return maxSum;

        return Math.max(circularSum,maxSum);

    }

    int maxSumUsingKaden(int[] arr){
        int curSum = 0;
        int maxSoFar = Integer.MIN_VALUE;

        for(int a: arr){
            curSum += a;
            maxSoFar = Math.max(maxSoFar,curSum);
            if(curSum < 0) curSum = 0;
        }
        return maxSoFar;
    }

    int minSumUsingKaden(int[] arr){
        int curSum = 0;
        int minSoFar = Integer.MAX_VALUE;

        for(int a: arr){
            curSum += a;
            minSoFar = Math.min(minSoFar,curSum);
            if(curSum > 0) curSum = 0;
        }
        return minSoFar;
    }
}
