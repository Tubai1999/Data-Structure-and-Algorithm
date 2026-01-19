package Revise.String;

public class CountAndSay {
    public static void main(String[] args) {
        int toFindTill=4;

        String s = "1";
        int n = s.length();
        int index=0;
        String ansStr = "";
        while(index<n){
            int count = 1;
            while (index+1<n && (s.charAt(index) == s.charAt(index+1))){
                count++;
                index++;
            }
            ansStr += count;
            ansStr += s.charAt(index);
            index++;
        }
        System.out.println(ansStr);
    }
}
