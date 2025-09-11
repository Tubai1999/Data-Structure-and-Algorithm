package Striver_Array;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        int n = arr.length;
        //brute force
//        int[] temp  = new int[n];
//        int tempIndex = 0;
//        for(int a:arr){
//            if(a != 0) temp[tempIndex++] = a;
//        }

        //optimal approach
        int zeroIndex = -1;
        for(int i = 0;i<n;i++){
            if(arr[i]==0){
                zeroIndex = i;
                break;
            }
        }

        for(int nonZeroIndex=zeroIndex+1;nonZeroIndex<n;nonZeroIndex++){
            if(arr[nonZeroIndex] != 0){
                int temp = arr[zeroIndex];
                arr[zeroIndex] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                zeroIndex++;
            }
        }


        for (int a:arr) System.out.print(a+" ");
    }
}
