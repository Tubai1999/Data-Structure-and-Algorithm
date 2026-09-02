package Striver_DP_Series;

import java.util.Arrays;

public class CountSubsetWithSumK {

    static int countSubsetHelper(int[] arr, int target, int index, int sum, int n, int[][] dp){
        if(index == n){
            if(sum == target) return 1;
            else return 0;
        }
        if(dp[index][sum] != -1) return dp[index][sum];
        int pick = 0;
        if(sum+arr[index]<=target) pick = countSubsetHelper(arr,target,index+1,sum+arr[index],n,dp);
        int notPick = countSubsetHelper(arr,target,index+1,sum,n,dp);
        return dp[index][sum] = pick+notPick;
    }



    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4};
        int sum = 0;
        for(int a:arr) sum+=a;
        int target = 5;
        int n = arr.length;
        int[][] dp = new int[n][sum+1];
        for(int[] a:dp) Arrays.fill(a,-1);
        System.out.println(countSubsetHelper(arr,target,0,0,n,dp));
    }
}
