package gfg160.Searching;

public class Day31 {
    public int peakElement(int[] arr) {
        // code here
        int n = arr.length;int ans = Integer.MIN_VALUE;
        if(n==1) return 0;
        for(int i = 0;i<n;i++){
            if((i==0 && arr[i]>arr[i+1]) || (i == n-1 && arr[i]> arr[i-1]) || (i>0 && i<n-1 && arr[i]>arr[i-1] && arr[i] > arr[i+1])){
                return i;
            }
        }
        return -1;
    }
}
