package comparableComparator;

import java.util.*;
import java.lang.*;

class subclass implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
//        return o1.age-o2.age;
        return Integer.compare(o1.age,o2.age);
    }
}

public class MainClass {

    public static void main(String[] args) {
        Animal obj1 = new Animal(1,"tommy");
        Animal obj2 = new Animal(21,"baravo");
        Animal obj3 = new Animal(15,"scobby");
        Animal obj4 = new Animal(16,"dollar");

        List<Animal> dogs = new ArrayList<>();
        dogs.add(obj1);
        dogs.add(obj2);
        dogs.add(obj3);
        dogs.add(obj4);
//        Collections.sort(dogs);
//        Collections.sort(dogs,new subclass()); //or dogs.sort(new subclass())
        Collections.sort(dogs, new Comparator<Animal>() {
                    @Override
                    public int compare(Animal o1, Animal o2) {
                        return o1.name.compareTo(o2.name);
                    }
                });
        Collections.sort(dogs,(Animal o1,Animal o2)->{
            return o1.name.compareTo(o2.name);
        });

                System.out.println(dogs);
    }
}
