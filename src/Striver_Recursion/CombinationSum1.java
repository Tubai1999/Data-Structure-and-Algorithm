package Striver_Recursion;

import java.util.ArrayList;

public class CombinationSum1 {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int target = 3;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> innerList = new ArrayList<>();
        combinationHelper(arr,0,ans,innerList,target,arr.length);
        System.out.println(ans);
    }

    static void combinationHelper(int[] arr, int index, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> innerList, int target, int n){
        if(index == n){
            if(target == 0){
                ans.add(new ArrayList<>(innerList));
            }
            return;
        }

        if(arr[index] <= target){
            innerList.add(arr[index]);
            combinationHelper(arr,index,ans, innerList, target-arr[index],n);
            innerList.remove(innerList.size()-1);
        }
        combinationHelper(arr,index+1,ans, innerList, target,n);

    }
}
