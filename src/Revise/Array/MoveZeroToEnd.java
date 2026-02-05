package Revise.Array;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,0,1};
        int n = arr.length;
        int firstZero = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==0) {
                firstZero = i;
                break;
            }
        }

        for(int i=firstZero+1;i<n;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[firstZero];
                arr[firstZero] = temp;
                firstZero++;
            }
        }
        for(int a:arr) System.out.print(a+" ");



//        -------------------------brute force
//        int[] ansArr = new int[n];
//
//        int j=0;
//        for(int i=0;i<n;i++){
//            if(arr[i] != 0){
//                ansArr[j++] = arr[i];
//            }
//        }
//        for(int a:ansArr) System.out.print(a+" ");

    }
}
