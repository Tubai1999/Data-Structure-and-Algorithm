package gfg160;

public class Day13 {
    public int missingNumber(int[] arr) {
        // Your code here
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i] <= 0 || arr[i] > n) arr[i] = 0;
        }

        for(int j = 0;j<n;j++){
            int val = Math.abs(arr[j]);
            if(val >= 1 && val <= n)
            {int index = val-1;
                if(arr[index] > 0){
                    arr[index] = -arr[index];
                }
                else if(arr[index]==0){
                    arr[index] = -(n+1);
                }}
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=0) return i+1;
        }
        return n+1;
    }
}
