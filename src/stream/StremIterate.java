package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StremIterate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,4,6);
        Stream<Integer> st1 = list.stream();
        Stream<Integer> st2 = Arrays.stream(new Integer[]{1,2,3,4});
        Stream<Integer> st3 = Stream.of(1,2,3,4);
//        st1.forEach(n -> System.out.println(n));
        Stream<Integer> st4 = list.stream().peek((Integer n) -> System.out.println(n));
    }
}
