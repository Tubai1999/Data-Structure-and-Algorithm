package gfg160.String;

public class Day20 {
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        String s = s1+s1;


        int[] lpsArr = lps(s2);


        int n = s.length();
        int m = s2.length();

        int i = 0;int j = 0;

        while(i<n){
            if(s.charAt(i) == s2.charAt(j)){
                i++; j++;
                if(j == m){
                    return true;
                }
            }
            else{
                if(j == 0) i++;
                else j = lpsArr[j-1];
            }

        }
        return false;


    }

    static int[] lps(String pat){
        int n = pat.length();
        int[] lpsArr = new int[n];
        int prefix = 0;
        int suffix = 1;

        while(suffix < n){
            if(pat.charAt(suffix) == pat.charAt(prefix)){
                lpsArr[suffix] = prefix+1;
                prefix++;suffix++;
            }
            else{
                if(prefix == 0) suffix++;
                else{
                    prefix = lpsArr[prefix-1];
                }
            }
        }
        return lpsArr;
    }
}
