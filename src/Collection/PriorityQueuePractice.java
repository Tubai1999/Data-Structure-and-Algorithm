package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

class PrirityQueueHelper implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.toString().compareTo(o1.toString());
    }
}

public class PriorityQueuePractice {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        PriorityQueue<Integer> pq = new PriorityQueue<>(new PrirityQueueHelper());
        pq.add(10);
        pq.add(2);
        pq.add(15);

        System.out.println(pq.poll());
    }
}
