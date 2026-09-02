package Striver_Recursion;

import java.util.*;

public class SubsetSum {
    public static void main(String[] args) {
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        set.add(new ArrayList<>(Arrays.asList(1,2)));
        set.add(new ArrayList<>(Arrays.asList(1,3)));
        set.add(new ArrayList<>(Arrays.asList(1,2)));

        for(ArrayList<Integer> list:set)
            System.out.println(list);
    }
}
