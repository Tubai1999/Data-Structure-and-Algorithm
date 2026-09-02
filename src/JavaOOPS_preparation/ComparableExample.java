package JavaOOPS_preparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExample implements Comparator<Employee> {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(15,"Raj",540));
        list.add(new Employee(102,"Tridib",51));

        list.add(new Employee(19,"Sonu",70));

//        Collections.sort(list);
        Collections.sort(list,(Employee e1, Employee e2) ->{
            return e1.weight-e2.weight;
        });
        System.out.println(list);
//        for(Employee e:list){
//            System.out.println(e.toString());
//        }
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.weight- o2.weight;
    }
}


