package gfg160.Array;

public class Day11 {
    int maxProduct(int[] arr) {
        // code here
        int ans = Integer.MIN_VALUE;
        int suffix = 1;
        int prefix = 1;
        int n = arr.length;

        for(int i=0;i<arr.length;i++){
            if(suffix == 0) suffix = 1;
            if(prefix == 0) prefix = 1;
            prefix = prefix * arr[i];
            suffix = suffix * arr[n-1-i];

            ans = Math.max(ans,Math.max(suffix,prefix));
        }

        return ans;
    }
}
