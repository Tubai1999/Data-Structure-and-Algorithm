package ImmutableClassPractice;

import java.util.ArrayList;
import java.util.List;

final public class immuClass {
     private final int id;
     private final List<Integer> list;

    public List<Integer> getList() {
        return new ArrayList<>(list);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private final String name;
    immuClass(int id, List<Integer> list, String name){
        this.id = id;
        this.list = list;
        this.name = name;
    }
}
