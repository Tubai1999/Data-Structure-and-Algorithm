package comparableComparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person>{
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
//        return this.age-o.age;
        return this.name.compareTo(o.name);
    }
}

public class ComparablePractice {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("tridib",10));
        list.add(new Person("sonu",20));
        Collections.sort(list);
        for (Person p:list) System.out.println(p);
    }
}
