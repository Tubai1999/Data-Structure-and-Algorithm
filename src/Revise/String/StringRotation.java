package Revise.String;

public class StringRotation {
    public static void main(String[] args) {
        String  s = "hello", goal = "llohe";
        int n = s.length() , m = goal.length();
        s = s+s;
        for(int i = 0;i<s.length()/2;i++){
            int j=0;
            if(s.charAt(i)==goal.charAt(j)){
                while(j<m){
                    if(s.charAt(i+j) == goal.charAt(j)) j++;
                    else break;
                }
                if(j==m) {
                    System.out.println("possible");
                    return;
                }
            }
        }
        System.out.println("not possible");

    }
}
