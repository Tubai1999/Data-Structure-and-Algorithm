package gfg160.Array;

public class Day5 {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int i = n-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j = n-1;
            while(arr[i] >= arr[j]){
                j--;
            }
            swapElement(arr,i,j);
        }
        reverseChunk(arr,i+1,n-1);

    }

    void reverseChunk(int[] arr, int start, int end){

        while(start < end){
            swapElement(arr,start,end);
            start++;end--;
        }
    }

    void swapElement(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
