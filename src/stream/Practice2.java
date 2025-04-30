package stream;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Stream;

public class Practice2 {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> st = Stream.iterate(100,e -> e*100).limit(5);
        st.forEach(e -> System.out.println(e));
    }
}
