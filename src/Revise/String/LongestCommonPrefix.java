package Revise.String;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public static void main(String[] args) {
//        ArrayList<String> strArra = {"flower", "flow", "flight"};
        String[] arr = {"flower", "flow", "flight"};
        String ansStr = arr[0];
        for(int i=1;i< arr.length;i++){
            String comStr=arr[i];
            int j=0; //int k=0;
            while(j<ansStr.length() && j<comStr.length()){
                if(ansStr.charAt(j) == comStr.charAt(j)){
                    j++;
                }
                else break;
            }
            ansStr = ansStr.substring(0,j);
            System.out.println(ansStr);
        }
    }
}
