package Interface;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {
    public static void main(String[] args) {
        List<String> fruits = List.of("banana","apple","kiwi","banana");
        Stream<String> stream = fruits.stream();
//        HashSet<Object> set =  stream.sorted()
//                .collect(Collectors.toCollection(HashSet::new));
//        System.out.println(set);
        stream.filter(fruit -> fruit.length()<=5)
                .forEach(System.out::println);


    }
}
