package stream;

import java.util.*;
import java.util.stream.Stream;

public class Practice4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,8,6,4,2);

        Object[] objArr = list.stream().filter((Integer val) -> val>=5).toArray();
        Integer[] intArr = list.stream().filter((Integer val) -> val>=5).toArray((int size) -> new Integer[size]);
//        st.forEach(e-> System.out.println(e));

    }
}
