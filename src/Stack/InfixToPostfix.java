package Stack;

import java.util.ArrayDeque;

public class InfixToPostfix {
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        ArrayDeque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i)=='('){
                stack.push('(');
            }
            else if(s.charAt(i)==')'){
                while(stack.peek() != '('){
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while(!stack.isEmpty() && checkPresedence(s.charAt(i)) <= checkPresedence(stack.peek())){
                    sb.append(stack.pop());
                }
                stack.push(s.charAt(i));
            }

        }
        while (!stack.isEmpty()) sb.append(stack.pop());
        System.out.println(sb.toString());
    }
    static int checkPresedence(char c){
        switch (c)
        {
            case '^':
                return 3;
            case '/':
            case '*':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return -1;
        }
    }
}
