package Striver_DP_Series;


import java.util.Arrays;

public class NinjasTraining {

    static int ninjaTrainingHelper(int[][] arr, int row, int c, int n, int[][] dp){
        if(row == n) {
            return 0;
        }
        if(dp[row][c+1] != -1) return dp[row][c+1];
        int maxVal = Integer.MIN_VALUE;
        for(int col = 0;col<3;col++){
            if(col != c){
                int val = arr[row][col]+ninjaTrainingHelper(arr,row+1,col,n,dp);
                maxVal = Math.max(val,maxVal);
            }
        }
        return dp[row][c+1]=maxVal;
    }



    public static void main(String[] args) {
        int[][] points = {{1,2,3},
                {10,20,30},{8,7,6}};
        int row = points.length;
        int[][] dp = new int[row][4];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        System.out.println(ninjaTrainingHelper(points,0,-1,row,dp));
    }
}
