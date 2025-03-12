package gfg160.TwoPointer;
import java.util.*;

public class Day57 {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<k; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ans.add(map.size());
        int n = arr.length;
        for(int i = k;i<n;i++){
            if(map.get(arr[i-k]) == 1){
                map.remove(arr[i-k]);
            }
            else{
                map.put(arr[i-k],map.get(arr[i-k])-1);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            ans.add(map.size());
        }
        return ans;
    }
}
