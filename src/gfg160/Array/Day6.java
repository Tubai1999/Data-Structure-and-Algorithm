package gfg160.Array;
import java.util.*;

public class Day6 {
    public List<Integer> findMajority(int[] nums) {



        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int count1 = 0; int count2 = 0;
        int major1 = Integer.MAX_VALUE;
        int major2 = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(count1 == 0){
                count1 = 1;
                major1 = nums[i];
            }
            else if(count2 == 0){
                count2 = 1;
                major2 = nums[i];
            }
            else if(major1 == nums[i]){
                count1++;
            }
            else if(major2 == nums[i]){
                count2++;
            }
            else{
                count1--;count2--;
            }
        }
        count1 = 0;count2 =0;

        for(int a:nums){
            if(a == major1) count1++;
            else if(a == major2) count2++;
        }

        if(count1 > (n/3)) ans.add(major1);
        if(count2 > (n/3)) ans.add(major2);


        Collections.sort(ans);
        return ans;









        // uisng map
        // List<Integer> ans = new ArrayList<>();
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int num : nums){
        //     if(map.containsKey(num)){
        //         map.put(num,map.get(num)+1);
        //     }
        //     else{
        //         map.put(num,1);
        //     }
        // }
        // int oneThirdVal = nums.length/3;
        // for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
        //     if(entry.getValue() > oneThirdVal) ans.add(entry.getKey());
        // }
        // return ans;
    }
}
