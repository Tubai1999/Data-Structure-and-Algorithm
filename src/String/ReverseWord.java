package String;

import java.util.Stack;

//Reverse Words in a String
public class ReverseWord {
    public static void main(String[] args) {
        String s = "this is an amazing program";
        String temp="";
        Stack<String> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                st.push(temp);
                temp = "";
            }
            else{
                temp += s.charAt(i);
            }
        }
        st.push(temp);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
