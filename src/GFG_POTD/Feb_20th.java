package GFG_POTD;
import java.util.*;

public class Feb_20th {
    public ArrayList<Double> getMedian(int[] arr) {
        // code here
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Double> ans = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            maxHeap.add(arr[i]);
            minHeap.add(maxHeap.poll());
            if(minHeap.size() > maxHeap.size()){
                maxHeap.add(minHeap.poll());
            }

            if(maxHeap.size() != minHeap.size()){
                ans.add((double)maxHeap.peek());
            }
            else{
                ans.add((double)(maxHeap.peek() + minHeap.peek())/2);
            }
        }
        return ans;
    }
}
