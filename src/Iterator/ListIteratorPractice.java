package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(15);
        list.add(11);

        ListIterator<Integer> l = list.listIterator();
        while (l.hasNext()) {
            l.next();
        }
        while (l.hasPrevious()){
            System.out.println(l.previous());
        }

    }
}
