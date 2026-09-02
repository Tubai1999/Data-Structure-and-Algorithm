package Striver_Recursion;

import java.util.ArrayList;

public class PrintSubSequence_sumK_sngleAns {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        ArrayList<Integer> ans = new ArrayList<>();
        helper(arr,ans,0,0,k,3);
    }

    static boolean helper(int[] arr, ArrayList<Integer> ans, int index, int sum, int k, int n ){
        if(index == n){
            if(sum == k){
                for(Integer a: ans) System.out.print(a);
                System.out.println();
                return true;
            }

            return false;
        }
        ans.add(arr[index]);
        if(helper(arr,ans,index+1,sum+arr[index],k,n)) return true;
        ans.remove(ans.size()-1);
        if(helper(arr,ans,index+1,sum,k,n)) return true;
        return false;
    }
}
