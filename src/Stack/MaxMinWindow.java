package Stack;

import java.util.ArrayList;

public class MaxMinWindow {
    public static void main(String[] args) {
        int[] arr = {10,20,30,50,10,70,30};
        int n = arr.length; //7
        ArrayList<Integer> list = new ArrayList<>();

        for(int winSize=1;winSize<=n;winSize++) // for all size of window
        {
            int maxOfMin = Integer.MIN_VALUE;
            for(int i=0;i<=n-winSize;i++){
                int curMin = Integer.MAX_VALUE;
                for(int j=i;j<i+winSize;j++){
                    curMin = Math.min(curMin,arr[j]);
                }
                maxOfMin = Math.max(maxOfMin,curMin);
            }
            list.add(maxOfMin);
        }
        for(int a:list){
            System.out.print(a+"  ");
        }
    }
}
