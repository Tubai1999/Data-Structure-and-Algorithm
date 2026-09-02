package gfg160.Hashing;
import  java.util.*;

public class CountPairs {
    int countPairs(int arr[], int target) {
        // Your code here
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :arr){
            int complement = target - i;
            if(map.containsKey(complement)) count+= map.get(complement);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return count;
    }
}
