package Interface;

import java.util.List;
import java.util.stream.Stream;

public class JavaStream {
    public static void main(String[] args) {
        List<String> fruits = List.of("banana","apple","kiwi");
        Stream stream = fruits.stream();
        stream.forEach(fruit -> System.out.println(fruit));
        stream.forEach(fruit -> System.out.println(fruit));
    }
}
