package gfg160.Sorting;

public class Day29 {
    public int findMin(int[] arr) {

        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid] > arr[high]){
                low = mid+1;
            }
            else high = mid;
        }
        return arr[low];
        //complexity O(logn)
        // complete the function here
        // complexity O(n)
        // int ans = arr[0];
        // for(int i = 1; i<arr.length; i++){
        //     ans = Math.min(ans,arr[i]);

        // }
        // return ans;
    }
}
