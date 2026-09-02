package Striver_Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class M_coloring {
    public static void main(String[] args) {
        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 3},
                {3, 0},
                {0, 2}
        };

        int n = 4; // number of nodes
        int m = 3; // number of colors
        ArrayList<ArrayList<Integer>> adj = makeAdjacency(edges,n);
        int[] colorArr = new int[n];
        System.out.println(M_coloring(0,n,m,colorArr,adj));

    }

    static boolean M_coloring(int node, int n, int m, int[] colorArr, ArrayList<ArrayList<Integer>> adj){
        if(node == n) return true;

        for(int color = 1; color <= m; color++){
            if(isPossible(node,color,colorArr,adj)){
                colorArr[node] = color;
                if(M_coloring(node+1,n,m,colorArr, adj)) return true;
                colorArr[node] = 0;
            }
        }
        return false;
    }

    static boolean isPossible(int node, int color, int[] colorArr,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> neighbour = adj.get(node);
        for (Integer a: neighbour){
            if(colorArr[a] == color) return  false;
        }
        return  true;
    }


    static ArrayList<ArrayList<Integer>> makeAdjacency(int[][] edges, int n){
        ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();
        for(int i = 0;i<n;i++){
            finalList.add(new ArrayList<>());
        }

        for(int[] arr: edges){
            finalList.get(arr[0]).add(arr[1]);
            finalList.get(arr[1]).add(arr[0]);
        }
        System.out.println(finalList);
        return finalList;
    }
}
