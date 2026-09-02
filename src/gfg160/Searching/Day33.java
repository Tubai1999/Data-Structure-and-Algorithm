package gfg160.Searching;
import java.util.*;

public class Day33 {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low = 1; int n = stalls.length;
        int high = stalls[n-1] - stalls[0]; int ans = -1;

        while(low <= high){
            int mid = (low+high)/2;
            if(isPossible(stalls,k,mid)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;

    }

    static boolean isPossible(int[] stalls, int cow, int minDisBetweenCow){
        int c = 1;int lastStallPos = stalls[0];

        for(int i = 1; i<stalls.length; i++){
            if(stalls[i] - lastStallPos >= minDisBetweenCow){
                c++;
                lastStallPos = stalls[i];
            }

            if(c == cow) return true;
        }
        return false;
    }
}
