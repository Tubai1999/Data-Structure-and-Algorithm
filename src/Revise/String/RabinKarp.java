package Revise.String;

import java.util.HashMap;
import java.util.Map;

public class RabinKarp {
    public static void main(String[] args) {
        String s = "aaaaab";
        String p= "aab";
        System.out.println("pattern matched: "+ isMathced(s,p));
    }

    static boolean isMathced(String s, String p){
        Map<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('b',2);
        int n = s.length();
        int m = p.length();
        int sSum = 0;
        int pSum = 0;
        int i=0;
        while (i<m){
            sSum +=  map.get(s.charAt(i));
            pSum += map.get(p.charAt(i));
            i++;
        }
        System.out.println(sSum);
        System.out.println(pSum);
        if(sSum == pSum) return true;
        for(int j=m;j<n;j++){
            sSum = sSum+map.get(s.charAt(j))-map.get(s.charAt(j-m));
            System.out.println(sSum);
            if ((sSum == pSum)) return  true;
        }
        return false;
    }

//    static boolean isMathced(String s, String p){  //naive approach
//        int n = s.length();
//        int m = p.length();
//        for(int i=0;i<n-m+1;i++){
//            int j=0;
//            while(j<m && s.charAt(i+j) == p.charAt(j)){
//                j++;
//            }
//            if(j==m) return true;
//        }
//        return false;
//    }
}
