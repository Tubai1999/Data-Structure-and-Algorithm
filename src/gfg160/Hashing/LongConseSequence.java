package gfg160.Hashing;
import java.util.*;

public class LongConseSequence {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set  = new HashSet<>();
        for(int a:arr){
            set.add(a);
        }


        int ans = Integer.MIN_VALUE;


        for(int i = 0;i<arr.length;i++){
            int curEle = arr[i];
            int count = 1;
            if(!set.contains(curEle-1)){
                while(set.contains(curEle+1)){
                    count++;
                    curEle++;
                }
            }
            ans = Math.max(ans,count);
        }

        return ans;}
}
