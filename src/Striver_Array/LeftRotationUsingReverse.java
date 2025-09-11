package Striver_Array;

public class LeftRotationUsingReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int noOfLeftRotation = 3;
        reverseArry(arr,0,noOfLeftRotation-1);
        reverseArry(arr,noOfLeftRotation,n-1);
        reverseArry(arr,0,n-1);
        for(int a: arr) System.out.print(a+" ");

    }

    static void reverseArry(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
    }
}
