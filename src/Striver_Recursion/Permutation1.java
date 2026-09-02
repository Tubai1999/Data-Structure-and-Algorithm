package Striver_Recursion;

import java.util.ArrayList;

public class Permutation1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;
        boolean[] isOccupied = new boolean[n];
        ArrayList<Integer> innerList = new ArrayList<>();
        Permutation1Helper(arr,0,isOccupied,innerList,n);
    }

    static void Permutation1Helper(int[] arr,int index, boolean[] isOccupied, ArrayList<Integer> list, int n){
        if(list.size() == n) System.out.println(list);
        for(int i = 0; i<n; i++){
            if(isOccupied[i] == false){
                list.add(arr[i]);
                isOccupied[i] = true;
                Permutation1Helper(arr,index,isOccupied,list,n);
                list.remove(list.size()-1);
                isOccupied[i] = false;
            }

        }
    }
}
