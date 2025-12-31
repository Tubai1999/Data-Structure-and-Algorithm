package Revise.String;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public static void main(String[] args) {
//        ArrayList<String> strArra = {"flower", "flow", "flight"};
        String[] arr = {"flower", "flow", "flight"};
        String s = arr[0];
        int index=0;
        for(int i=1;i<arr.length;i++){
            index=0;
            while (index<arr[i].length() && index<s.length()){
                if(arr[i].charAt(index) != s.charAt(index)) break;
                index++;
            }
        }
        System.out.println(index);
    }
}
