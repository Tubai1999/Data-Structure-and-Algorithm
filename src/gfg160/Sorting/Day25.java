package gfg160.Sorting;
import java.util.*;

public class Day25 {
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        ArrayList<int[]> list = new ArrayList<>();
        int n = intervals.length;
        for(int i = 0;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(end < newInterval[0]){
                list.add(new int[]{start,end});
            }
            else if(start > newInterval[1]){
                list.add(newInterval);
                newInterval = intervals[i];
            }
            else{
                newInterval[0] = Math.min(start,newInterval[0]);
                newInterval[1] = Math.max(end,newInterval[1]);
            }
        }
        list.add(newInterval);
        return list;
    }
}
