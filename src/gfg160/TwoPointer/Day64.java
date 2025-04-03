package gfg160.TwoPointer;

public class Day64 {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int cumProduct = 1;
        int n = arr.length; int zeroCount = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == 0) {
                zeroCount++;
            }
            else cumProduct *= arr[i];
        }

        int[] ans = new int[n];

        if(zeroCount > 1) return ans;

        for(int i = 0; i<n; i++){
            if(arr[i] == 0) ans[i] = cumProduct;
            else{
                ans[i] = (zeroCount > 0) ? 0 : cumProduct/arr[i];
            }
        }


        return ans;
    }
}
