package Hashing;
import java.util.*;
public class CountSubArraysWithSum {
    public int countSubarrays(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();

        int count = 0;
        int prefixSum = 0;
        map.put(0,1);
        for(int i=0; i<arr.length; i++){
            prefixSum += arr[i];
            if(map.containsKey(prefixSum-k)){
                count += map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
