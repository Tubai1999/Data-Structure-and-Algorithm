package Striver_DP_Series;
import java.util.*;

public class DP1_Fibonacci {
    public static void main(String[] args) {
//        System.out.println(fibo(5));
        int n = 4;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
//        System.out.println(fibo(n,dp));
        System.out.println(fibo(n));
    }

    //Tabulation
    static int fibo(int n){
        int prev2 = 0;
        int prev1 = 1;
        for(int i = 2;i<=n;i++){
            int cur = prev1+prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }

//    memoization
//    static int fibo(int n,int[] dp){
//        if(n<=1) return n;
//        if(dp[n] != -1) return dp[n];
//        return dp[n] = fibo(n-1,dp)+fibo(n-2,dp);
//    }


//    using basic recursion
//    static int fibo(int n){
//        if(n<=1) return n;
//        return fibo(n-1)+fibo(n-2);
//    }
}
