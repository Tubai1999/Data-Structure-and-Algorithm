package ImmutableClassPractice;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        immuClass obj  = new immuClass(1, list, "tridib");
//        System.out.println(obj.id);
        obj.getList().add(5);
        System.out.println(obj.getList());
    }
}
