package gfg160;

public class Day2 {
    void pushZerosToEnd(int[] arr) {

        int first = 0;
        int second = 0;
        while(second<arr.length){
            if(arr[second] != 0){
                swapTwoNumber(arr,first,second);
                first++;
            }second++;
        }




        // code here
        // boolean isZeroPresent = false;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] == 0) {
        //         isZeroPresent = true;
        //         break;
        //     }
        // }
        // if(isZeroPresent){
        //     Arrays.sort(arr,Collections.reverseOrder());
        // }
    }

    void swapTwoNumber(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end] = temp;
    }
}
