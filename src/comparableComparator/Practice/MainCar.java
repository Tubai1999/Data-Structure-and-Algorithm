package comparableComparator.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainCar {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("sedan","petrol"));
        carList.add(new Car("suv","diesel"));
        carList.add(new Car("xuv","cng"));

//        Arrays.sort(carList,(Car a,Car b) -> a.engine.compareTo(b.engine));
//    Collections.sort(carList,(Car a, Car b) -> a.engine.compareTo(b.engine));
        Collections.sort(carList);
        System.out.println(carList);
    }
}
