package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Practice3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,2,3,4,5,6,6);
//        Stream<Integer> newStream = list.stream().peek(e -> System.out.println(e));
        Stream<Integer> newStream = list.stream().distinct();
        newStream.forEach(e-> System.out.println(e));
        List<Integer> ans = newStream.toList();
    }
}
