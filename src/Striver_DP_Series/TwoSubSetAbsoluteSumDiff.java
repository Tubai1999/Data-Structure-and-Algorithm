package Striver_DP_Series;

import java.util.Arrays;

public class TwoSubSetAbsoluteSumDiff {

    static int TwoSubSetAbsoluteSumDiffHelper(int[] arr, int index, int sum, int totalSum, int[] ans,int[][] dp){
        if(index == arr.length){
           return Math.abs(sum - (totalSum-sum));
        }
        if(dp[index][sum] != -1) return dp[index][sum];
        int include = TwoSubSetAbsoluteSumDiffHelper(arr,index+1,sum+arr[index],totalSum,ans,dp);
        int exclude = TwoSubSetAbsoluteSumDiffHelper(arr,index+1,sum,totalSum,ans,dp);
        return dp[index][sum] = Math.min(include,exclude);

    }
    public static void main(String[] args) {
        int[] arr = {3,4,3,15};
        int totalSum = 0;
        for(int a:arr) totalSum += a;
        int[] ans = new int[1];
        ans[0] = Integer.MAX_VALUE;
        int n = arr.length;

        int[][] dp = new int[n][totalSum+1];
        for(int[] a:dp) Arrays.fill(a,-1);
        System.out.println(TwoSubSetAbsoluteSumDiffHelper(arr,0,0,totalSum,ans,dp));
//        System.out.println(ans[0]);

    }
}
