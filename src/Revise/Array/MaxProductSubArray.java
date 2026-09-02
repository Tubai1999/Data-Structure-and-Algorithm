package Revise.Array;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,3,-4,-3,5,-1};
        int n = arr.length;

        int max_to_this_index = arr[0];
        int min_to_this_index = arr[0];
        int ans = arr[0];

        for(int i=1;i<n;i++){
            int cur = arr[i];
            int prev_max = max_to_this_index;
            int prev_min = min_to_this_index;

            max_to_this_index = Math.max(cur,Math.max(cur*prev_max,cur*prev_min));
            min_to_this_index = Math.min(cur,Math.min(cur*prev_max,cur*prev_min));
            ans = Math.max(ans,max_to_this_index);
        }
        System.out.println(ans);
    }
}
