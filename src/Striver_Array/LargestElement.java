package Striver_Array;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,5,19,8,9};
        int n = arr.length;
        int ans = arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i]>ans) ans = arr[i];
        }
        System.out.println(ans);
    }
}
