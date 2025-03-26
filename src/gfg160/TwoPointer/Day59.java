package gfg160.TwoPointer;

public class Day59 {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int[] prefixMax = new int[n];
        prefixMax[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            prefixMax[i] = Math.max(prefixMax[i-1],arr[i]);
        }

        int[] suffixMax = new int[n];
        suffixMax[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            suffixMax[i] = Math.max(suffixMax[i+1],arr[i]);
        }

        int totalTrappedWater = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] < prefixMax[i] && arr[i] < suffixMax[i]){
                totalTrappedWater += Math.min(suffixMax[i],prefixMax[i])-arr[i];
            }
        }
        return totalTrappedWater;
    }
}
