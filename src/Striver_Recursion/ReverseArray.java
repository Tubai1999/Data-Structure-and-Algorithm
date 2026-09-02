package Striver_Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        ReverseArrayHelper(arr,0,arr.length-1);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }

    static void ReverseArrayHelper(int[] arr, int start, int end){
        if(start >= end) return;
        swapArray(arr,start,end);
        ReverseArrayHelper(arr,start+1,end-1);
    }

    static void swapArray(int[] arr, int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
