package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Practice6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,8,6,4,2);
        Long curTime = System.currentTimeMillis();
         list.stream().map((Integer val) -> val*1026).forEach(e-> System.out.println(e));
        System.out.println(System.currentTimeMillis()-curTime);

        Long curTimeForParallel = System.currentTimeMillis();
        list.parallelStream().map((Integer val) -> val*1026).forEach(e-> System.out.println(e));
        System.out.println(System.currentTimeMillis()-curTimeForParallel);
    }
}
