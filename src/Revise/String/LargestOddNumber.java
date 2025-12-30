package Revise.String;

public class LargestOddNumber {
    public static void main(String[] args) {
//        String s = "0214638";
        String s = "5347";

        int n = s.length();

        int end = n-1;
        int start = 0;
        while(end >= 0){
            if((s.charAt(end)-'0') % 2 == 0) end--;
            else break;
        }

        while(start < n){
            if(s.charAt(start)=='0'){
                start++;
            }
            else break;
        }

        System.out.println(start+"  "+end);
        System.out.println(s.substring(start,end+1));
    }
}
