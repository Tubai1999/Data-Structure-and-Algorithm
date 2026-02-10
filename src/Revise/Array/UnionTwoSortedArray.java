package Revise.Array;

import java.util.HashMap;

public class UnionTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,2,3,4,4,5};

        int n = arr1.length;
        int m = arr2.length;

        int i=0,j=0;
        while (i<n && j<m){
            if(arr1[i] < arr2[j]){
                System.out.println(arr1[i]);
                i++;
            }
            else if(arr1[i] == arr2[j]){
                System.out.println(arr2[j]);
                i++;j++;
            }
            else {
                System.out.println(arr2[j]);
                j++;
            }
        }

//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        for(int i=0;i<arr1.length;i++){
//            if(map.containsKey(arr1[i])){
//                map.put(arr1[i],map.get(arr1[i]));
//            }
//            else map.put(arr1[i],1);
//        }
//
//        for(int i=0;i<arr2.length;i++){
//            if(map.containsKey(arr2[i])){
//                map.put(arr2[i],map.get(arr2[i]));
//            }
//            else map.put(arr2[i],1);
//        }
//
//        for (int a:map.keySet()){
//            System.out.println(a);
//        }
    }
}
