package Striver_Recursion;

public class IsStringPalindrome {
    public static void main(String[] args) {
        boolean isPalindrome = IsStringPalindromeHelper("ABCCA",0,4);
        System.out.println(isPalindrome);
    }

    static boolean IsStringPalindromeHelper(String s, int start, int end){
        if(start>= end) return true;
        if(s.charAt(start) != s.charAt(end)) return false;
        return IsStringPalindromeHelper(s,start+1,end-1);
    }
}
