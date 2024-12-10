package DynamicProgramming;
import java.util.*;

public class fibonacci {

    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
//        System.out.println(fibo(n, dp));
        fibo(n,dp);
    }
    static int fibo(int n,int[] dp)
    {
        if(dp[n]!=-1) return dp[n];

        if(n<=0) return 0;
        if(n==1) return 1;
        System.out.println(n);
        return dp[n] = fibo(n-1,dp)+fibo(n-2,dp);
    }
}
