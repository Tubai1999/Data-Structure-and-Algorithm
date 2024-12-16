package Recursion;

public class PalindromeString {
    public static boolean isPalindrome(String str)
    {
        //You can code here
        return isPalindromeHelper(str,0,str.length()-1);

    }


    static boolean isPalindromeHelper(String s,int start,int end)
    {
        if(start>=end) return true;
        if(s.charAt(start)==s.charAt(end))    return isPalindromeHelper(s,start+1,end-1);

        else return false;

    }
}
