package immutableClass;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class ToBeImmutable{
    private final String name;
    private final ArrayList<Integer> ages;

    ToBeImmutable(String name, ArrayList<Integer> ages){
        this.name = name;
        this.ages = ages;
    }

    String getName(){
        return name;
    }
    ArrayList<Integer> getAges(){
        return new ArrayList<>(ages);
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4);
        ToBeImmutable obj = new ToBeImmutable("tridib", new ArrayList<>(list));
    }
}
