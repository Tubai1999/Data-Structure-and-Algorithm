package Striver_DP_Series;

public class SubSetSumK {
    static boolean subSetSumHelper(int[] arr, int index, int target, int sum, int n, Boolean[][] dp){
        if(sum == target) return true;
        if(index == n || sum >target) return false;
        if(dp[index][sum] != null) return dp[index][sum];
        boolean pick = subSetSumHelper(arr,index+1,target,sum+arr[index],n,dp);
        boolean nonPick = subSetSumHelper(arr,index+1,target,sum,n,dp);
        return dp[index][sum] =  pick || nonPick;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,3,3,4,7};
        int sum = 0;
        for(int a:arr) sum+=a;
        sum = sum/2;
        int n = arr.length;
        Boolean[][] dp = new Boolean[n][sum+1];
        System.out.println(subSetSumHelper(arr,0,sum,0,arr.length, dp));
    }
}
