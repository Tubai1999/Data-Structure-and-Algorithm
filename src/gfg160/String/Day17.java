package gfg160.String;

public class Day17 {
    static char nonRepeatingChar(String s) {
        // Your code here
        if(s == null || s.isEmpty()) return '$';

        int[] frequencyArr = new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            frequencyArr[c-'a'] ++;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(frequencyArr[c-'a']  == 1) return c;

        }
        return '$';


    }
}
