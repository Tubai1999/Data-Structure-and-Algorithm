package Queue;
import java.util.*;

public class SlidingWindowMaximum {
    public static List<Integer> maxSlidingWindow(int[] nums, int k)
    {
        //You can code here
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        while(i<k){
            while(!dq.isEmpty() && dq.getLast() < nums[i]){
                dq.pollLast();
            }
            dq.offerLast(nums[i]);
            i++;
        }

        int n = nums.length;
        for(;i<n;i++){
            ans.add(dq.peekFirst());
            if(nums[i-k] == dq.peekFirst()) dq.pollFirst();
            while(!dq.isEmpty() && dq.getLast() < nums[i]){
                dq.pollLast();
            }
            dq.offerLast(nums[i]);

        }
        ans.add(dq.peekFirst());
        return ans;
    }
}
