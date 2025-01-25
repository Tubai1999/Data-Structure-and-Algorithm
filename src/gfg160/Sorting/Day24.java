package gfg160.Sorting;
import java.util.*;

public class Day24 {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2});
        list.add(new int[]{10, 2});
        list.add(new int[]{11, 2});
        list.add(new int[]{1, 4});

        list.sort(Comparator.comparingInt(value -> value[0]));

        for(int[] arr:list){
            System.out.println(Arrays.toString(arr));
        }

    }
}
