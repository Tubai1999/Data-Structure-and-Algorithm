package GFG_POTD;
import java.util.*;

public class March_1st {
    static String decodeString(String s) {
        // code here
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int num=0;

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num = (num*10) + (c-'0');
            }
            else if(c == '['){
                countStack.push(num);
                stringStack.push(currentString);
                num = 0;
                currentString = new StringBuilder();
            }
            else if(c == ']'){
                int repeatCount = countStack.pop();
                StringBuilder decodeString = stringStack.pop();
                for(int i = 0;i<repeatCount;i++){
                    decodeString.append(currentString);
                }
                currentString = decodeString;
            }
            else{
                currentString.append(c);
            }
        }

        return currentString.toString();
    }
}
