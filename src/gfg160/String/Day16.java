package gfg160.String;

public class Day16 {
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        // if(s1.equals(s2)) return false;
        if(s1.length() != s2.length()) return false;

        int[] arrayForFrequency = new int[26];
        for(int i=0;i<s1.length();i++){
            arrayForFrequency[s1.charAt(i)-'a'] += 1;
            arrayForFrequency[s2.charAt(i)-'a'] -= 1;
        }



        for(int a:arrayForFrequency){
            if(a != 0) return false;
        }
        return true;
    }
}
