package Striver_Array;

public class LeftRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int NoOfRotation = 2;
        while(NoOfRotation%n>0){
            int firstElement = arr[0];
            for(int i = 0;i<n-1;i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = firstElement;
            NoOfRotation--;
        }

        for(int a:arr) System.out.print(a+" ");
    }
}
