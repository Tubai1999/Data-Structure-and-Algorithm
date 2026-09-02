package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Practice5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,8,6,4,2);
//        Stream<Integer> st = list.stream().reduce((Integer a, Integer b) -> a+b);
        Integer st = list.stream().reduce(0,(Integer a, Integer b) -> a+b);
        System.out.println(st);
    }
}
