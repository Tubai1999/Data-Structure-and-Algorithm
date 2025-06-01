package Striver_DP_Series;

import Practice.Package1.MainClass;

public class MinPathSumGrid {

    static int MainPathSumGridHelper(int[][] arr, int row, int col, int n, int m){
        if(row==n-1 && col==m-1) return arr[row][col];
        if(row == n || col == m) return Integer.MAX_VALUE;


        int right = arr[row][col]+MainPathSumGridHelper(arr,row,col+1,n,m);
        int down = arr[row][col]+MainPathSumGridHelper(arr,row+1,col,n,m);
        return Math.min(right,down);
    }


    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{5,9,60},{11,5,2}};
        System.out.println(MainPathSumGridHelper(arr,0,0,3,3));
    }
}
