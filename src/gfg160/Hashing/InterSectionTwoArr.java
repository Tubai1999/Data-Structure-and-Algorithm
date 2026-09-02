package gfg160.Hashing;
import java.util.*;

public class InterSectionTwoArr {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int ele:a){
            set.add(ele);
        }

        for(int ele: b){
            if(set.contains(ele)) {
                if(!list.contains(ele))
                    list.add(ele);
            }
        }

        return list;
    }
}
