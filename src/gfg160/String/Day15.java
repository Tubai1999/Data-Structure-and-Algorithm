package gfg160.String;

public class Day15 {
    public String addBinary(String s1, String s2) {
        // code here
        int carry = 0;
        int s1Length = s1.length();
        int s2Length = s2.length();
        int i = s1Length-1;
        int j = s2Length-1;
        StringBuilder sb = new StringBuilder();

        while(i>=0 || j>=0 || carry > 0){

            int digitA = (i>=0) ? s1.charAt(i)-'0' : 0;
            int digitB = (j>=0) ? s2.charAt(j)-'0' : 0;

            int sum = digitA+digitB+carry;
            sb.append(sum%2);
            carry = sum/2;
            i--;j--;
        }

        String ans =  sb.reverse().toString();
        ans = ans.replaceFirst("^0+(?!$)","");
        return ans;
    }
}
