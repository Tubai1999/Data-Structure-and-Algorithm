package Striver_Array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int n = arr.length;
        int i = 0;
//        int j=i+1;
        for(int j = 1;j<n;j++){
            if(arr[i] != arr[j]){
                arr[++i] = arr[j];
//                i = i+1;
            }
        }


        for (int a:arr) System.out.print(a+" ");
    }
}
