package Switch;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        switch ( val){
            case 1:
                System.out.println("it is one");
                break;
            case 2:
                System.out.println("it is two");
                break;
            default:
                System.out.println("it is default");
        }
    }
}
