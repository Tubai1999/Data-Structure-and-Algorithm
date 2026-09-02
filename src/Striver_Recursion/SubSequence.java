package Striver_Recursion;

public class SubSequence {
    public static void main(String[] args) {
        String s ="123";
        SubSequenceHelper("",s,0,3);
    }

    static void SubSequenceHelper(String ans,String s, int index, int n){
        if(index == n){
            System.out.println(ans);
            System.out.println("*********");
            return;
        }
        SubSequenceHelper(ans+s.charAt(index),s,index+1,n);
        SubSequenceHelper(ans,s,index+1,n);
    }

}