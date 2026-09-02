package Striver_Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Palindrome_Partitioning {
    static boolean isPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start) == s.charAt(end)){
                start++;end--;
                continue;
            }
            else return false;
        }
        return true;
    }

    static void Palindrome_PartitioningHelper(ArrayList<ArrayList<String>> ans, ArrayList<String> innerList,  String s, int index, int n){
        if(index == n){
            ans.add(new ArrayList<>(innerList));
            return;
        }

        for(int i = index; i<n;i++){
            if(isPalindrome(s,index,i)){
                innerList.add(s.substring(index,i+1));
                Palindrome_PartitioningHelper(ans,innerList,s,i+1,n);
                innerList.remove(innerList.size()-1);
            }
        }
    }


    public static void main(String[] args) {
        String s = "aabb";
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> innerList = new ArrayList<>();
        Palindrome_PartitioningHelper(ans,innerList,s,0,4);
        System.out.println(ans);

    }
}
