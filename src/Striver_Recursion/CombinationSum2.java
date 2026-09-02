package Striver_Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

    }

    static void combination2Helper(int[] arr, int index, ArrayList<ArrayList<Integer>> ans,
                                   ArrayList<Integer> innerList, int target, int n){
        for(int i = index; i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            innerList.add(arr[index]);
            combination2Helper(arr,index+1,ans,innerList,target-arr[index],n);
            innerList.remove(innerList.size()-1);
        }
    }
}
