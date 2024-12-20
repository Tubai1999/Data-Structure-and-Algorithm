package Recursion;

public class PalindromeStringPractice {
    public static void main(String[] args) {
        String s = "abahab";
        System.out.println(palindromeStringPracticeHelper(s,0,s.length()-1));
    }

    static boolean palindromeStringPracticeHelper(String s,int start,int end){
        if(start>= end) return true;
        return (s.charAt(start) == s.charAt(end) && palindromeStringPracticeHelper(s,start+1,end-1));
    }
}
