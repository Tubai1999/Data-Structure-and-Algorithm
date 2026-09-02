package gfg160.Hashing;
import java.util.*;
public class UnionTwoArr {
    // code here
    public static int findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int ele:a) set.add(ele);
        for(int ele:b) set.add(ele);
        return set.size();
    }
}
