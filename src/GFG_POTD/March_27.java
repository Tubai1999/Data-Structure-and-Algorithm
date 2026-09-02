package GFG_POTD;

import java.util.Arrays;

public class March_27 {
    static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int requirePlatform  = 0; int ans = 0;
        int n = arr.length;

        int i= 0; int j = 0;
        while(i<n && j<n){
            if(arr[i] <= dep[j]){
                requirePlatform++;
                ans = Math.max(ans,requirePlatform);
                i++;
            }
            else{
                requirePlatform--;j++;
            }
        }
        return ans;

    }
}
