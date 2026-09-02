package practiceInterview;

import java.util.*;

public class Example {

    static int[] findMulti(int[] arr){
        int n = arr.length;
        int[] prefixArr = new int[n];
        int count = 0;
        int prefixMulti = 1;
//        prefixArr[0] = arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i] == 0) count++;
            else prefixMulti *= arr[i];
        }
        if (count > 1) return prefixArr;
        if(count == 1){
            for(int i = 0;i<n;i++){
                if(arr[i] == 0) {
                    prefixArr[i] = prefixMulti;
                    return prefixArr;
                }
        }

        for(int i = 0;i<n;i++){
            prefixArr[i] = prefixMulti/arr[i];
            }
        }
        return prefixArr;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {2,4,3,2};
        int[] ans = findMulti(arr);
        for (int i=0;i<arr.length;i++) System.out.print(ans[i]+" ");
    }
}


//ex1:[2,4,6,0,7]
//
//    [0,0,0,336,0]
//
//        ex2: [2,4,3,2]
//
//        [24,12,16,24]