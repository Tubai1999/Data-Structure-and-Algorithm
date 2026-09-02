package DynamicProgramming;

public class ClimbStairs {
    public static void main(String[] args) {
        int[] arr = {10,15,20};
        int n  = arr.length;
        System.out.println(Math.min(climbStairsHelper(arr,0,n),climbStairsHelper(arr,1,n)));
    }
    static int climbStairsHelper(int[] arr, int index, int n){
        if(index >= n) return 0;
        return arr[index]+ Math.min(climbStairsHelper(arr,index+1,n),climbStairsHelper(arr,index+2,n));
    }
}
