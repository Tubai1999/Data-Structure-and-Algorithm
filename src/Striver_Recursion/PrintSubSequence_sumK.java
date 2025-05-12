package Striver_Recursion;

import java.util.ArrayList;

public class PrintSubSequence_sumK {
    public static void main(String[] args) {
        // print subsequence , where the sum is equal to K
        int[] arr = {1,2,3};
        int k = 3;
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        PrintSubSequence_sumK_Helper(arr, ans, 0, 0, k, arr.length);

    }

    static void PrintSubSequence_sumK_Helper(int[] arr, ArrayList<Integer> ans, int index, int sum, int k, int n){
        if(index == n){
            if(sum == k){
                for(Integer a: ans) System.out.print(a+" ");
                System.out.println();
//                System.out.println(ans);
            }
//            System.out.println(" ");
            return;
        }
        ans.add(arr[index]);
        PrintSubSequence_sumK_Helper(arr, ans,index+1,sum+arr[index], k, n);
        ans.remove(ans.size()-1);
        PrintSubSequence_sumK_Helper(arr, ans,index+1,sum, k, n);
    }

}
