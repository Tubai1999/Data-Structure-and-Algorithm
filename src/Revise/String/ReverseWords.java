package Revise.String;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseWords {
    public static void main(String[] args) {
        String s = " i am tridib";
        StringBuilder sb = new StringBuilder();

        int i = s.length()-1;
        while (i>=0){
            int end = i;
            while (i>= 0 && s.charAt(i) != ' '){
                i--;
            }
            sb.append(s.substring(i+1,end+1));
            i--;
            System.out.println(sb);
            sb.setLength(0);
        }
//        System.out.println(sb);


//        String temp="";
//        Deque<String> stack = new ArrayDeque<>();
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==' '){
//                System.out.println(temp);
//                stack.addFirst(temp);
//                temp = "";
//            }
//            else {
//                temp += s.charAt(i);
//            }
//        }
//        System.out.println(temp);
//        stack.addFirst(temp);
//        for(String st: stack){
//            System.out.println(st);
//        }
    }
}
