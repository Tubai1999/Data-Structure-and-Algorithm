package gfg160.Sorting;
import java.util.*;

public class Day24 {


    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        ArrayList<int[]> ans = new ArrayList();
        Arrays.sort(arr,(a,b)->{
            if(a[0]==b[0]){
                return Integer.compare(a[1],b[1]);
            }
            else{
                return Integer.compare(a[0],b[0]);
            }
        });

        int n = arr.length;
        for(int i = 0;i<n;i++){
            int start = arr[i][0];
            int end = arr[i][1];
            if(!ans.isEmpty() && ans.get(ans.size()-1)[1]>=end){
                continue;
            }
            for(int j = i+1; j<n;j++){
                if(end >= arr[j][0]){
                    end = Math.max(end,arr[j][1]);
                }
                else{
                    break;
                }
            }
            ans.add(new int[]{start,end});
        }


        return ans;
    }
//    public static void main(String[] args) {
//        List<int[]> list = new ArrayList<>();
//        list.add(new int[]{1, 2});
//        list.add(new int[]{10, 2});
//        list.add(new int[]{11, 2});
//        list.add(new int[]{1, 4});
//
//        list.sort(Comparator.comparingInt(value -> value[0]));
//
//        for(int[] arr:list){
//            System.out.println(Arrays.toString(arr));
//        }
//
//    }
}
