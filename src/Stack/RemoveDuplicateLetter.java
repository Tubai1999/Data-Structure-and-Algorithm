package Stack;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicateLetter {
    public static void main(String[] args) {
        String s = "cbabc";
        int[] freqArr = new int[26];
        boolean[] visited = new boolean[26];
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char[] arr = s.toCharArray();
        for(char c: arr){
            freqArr[c-'a']++;
        }
        for (char c : arr) {
            freqArr[c - 'a']--;
            if(visited[c-'a']) continue;
            while (!stack.isEmpty() && freqArr[stack.peek() - 'a'] > 0 && stack.peek() > c) {
                    visited[stack.peek()-'a'] = false;
//                    stack.pop();
                    stack.pollLast();
            }
//            stack.push(c);
            stack.addLast(c);
            visited[c-'a'] = true;

        }
        StringBuilder sb = new StringBuilder();
        System.out.println(stack);
//        while(!stack.isEmpty()) sb.append(stack.pop());
//        System.out.println(sb.toString());
        for(char c:stack) sb.append(c);
        System.out.println(sb.toString());
        System.out.println(stack.pop());




//        HashMap<Character,Integer> map = new HashMap<>();
//        String s = "abcab";
//        for(int i=0;i<s.length();i++){
//                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//        }
//
//        for(HashMap.Entry<Character,Integer> entry: map.entrySet()){
//            System.out.println(entry.getKey() +"->"+ entry.getValue());
//        }
    }
}
