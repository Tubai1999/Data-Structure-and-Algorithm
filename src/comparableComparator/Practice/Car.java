package comparableComparator.Practice;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    String name;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    String engine;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
    }



    @Override
    public int compareTo(Car o) {
        return this.engine.compareTo(o.engine);
    }
}
