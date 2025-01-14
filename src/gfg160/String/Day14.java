package gfg160.String;

public class Day14 {
    public int myAtoi(String s) {
        // Your code here
        int i = 0;
        int n = s.length();
        if(s == null || s.isEmpty()) return 0;

        //for removing leading space
        while(i<n && s.charAt(i) == ' ') i++;
        int sign = 1;
        long ans = 0;
        //for defining sign
        if(i<n && (s.charAt(i)=='+' || s.charAt(i) == '-')){
            sign = (s.charAt(i)=='-'? -1:1);
            i++;
        }

        while(i<n && isDigit(s.charAt(i))){
            ans = ans*10 + (s.charAt(i)-'0');

            if(ans * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(ans * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)(ans*sign);
    }

    boolean isDigit(char c){
        if(c-'0' >= 0 && c-'0' <= 9) return true;
        return false;
    }

}
