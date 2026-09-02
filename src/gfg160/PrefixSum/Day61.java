package gfg160.PrefixSum;

public class Day61 {
    //comment out
    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for(int i = 1;i<n;i++){
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }

        int[] suffixSum = new int[n];
        suffixSum[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            suffixSum[i] = suffixSum[i+1]+arr[i];
        }

        int cumVal = 0;

        for(int i = 0; i<n; i++){
            cumVal += arr[i];
            if(suffixSum[i] == cumVal) return i;

        }
        return -1;
    }
}
