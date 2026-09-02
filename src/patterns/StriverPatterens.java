package patterns;

import java.util.Scanner;

public class StriverPatterens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern6(n);
    }

    static void pattern1(int val){
        for(int i=0; i<val; i++){
            for(int j=0; j<val; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int val){
        for(int i=0; i<val; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int val){
        for(int i=0; i<val; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    static void pattern4(int val){
        for(int i=0; i<val; i++){
            for(int j=0; j<=i; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    static void pattern5(int val){
        for(int i=0; i<val; i++){
            for(int j=0; j<val-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int val){
        for(int i=0; i<val; i++){
            for(int j=0; j<val-i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
