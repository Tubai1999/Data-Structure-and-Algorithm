package comparableComparator.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(3, "John", 28),
                new Employee(1, "Alice", 24),
                new Employee(2, "Bob", 30)
        );

        Collections.sort(employees,(Employee obj1, Employee obj2) -> {
//            return obj1.getId().compareTo(obj2.getId());
            return obj1.getId()- obj2.getId();

        });
        System.out.println(employees);
    }
}
