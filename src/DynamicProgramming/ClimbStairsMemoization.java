package DynamicProgramming;

import java.util.Arrays;

public class ClimbStairsMemoization {
    static int minCostClimbingStairs(int[] cost) {
        // Write your code here
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(helper(cost,0,n,dp),helper(cost,1,n,dp));

    }

    static int helper(int[] cost, int index, int n, int[] dp){
        if(index >= n) return 0;
        if(dp[index] != -1) return dp[index];
        return dp[index] = cost[index]+ Math.min(helper(cost,index+1,n,dp),helper(cost,index+2,n,dp));
    }
}
