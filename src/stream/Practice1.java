package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> st = list.stream();
//        List<Integer> newList = st.toList();
        List<Integer> newList = st.filter(e -> e%2==0).map(e-> e*2).collect(Collectors.toList());
//        List<Boolean> newList = st.map(e -> e%2==0).collect(Collectors.toList());
//        newList.add(56);
        newList.forEach(s -> System.out.println(s));


    }
}
