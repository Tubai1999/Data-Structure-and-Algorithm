package gfg160.Array;

public class Day4 {
    static void reverseSubArray(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
    }



    static void rotateArr(int arr[], int d) {

        d = d%arr.length;
        reverseSubArray(arr,0,d-1);
        reverseSubArray(arr,d,arr.length-1);
        reverseSubArray(arr,0,arr.length-1);



        //  with extra space.
        // int n = arr.length;
        // int[] doubleArray = new int[n*2];
        // for(int i=0;i<2*n;i++){
        //     doubleArray[i] = arr[i%n];
        // }

        // for(int i=0;i<n;i++){
        //     arr[i] = doubleArray[(i+d)%(2*n)];
        // }
    }
}
