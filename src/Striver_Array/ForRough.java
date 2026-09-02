package Striver_Array;

public class ForRough {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int i = 0;
        if(arr[++i] != 2) System.out.println(i);
        System.out.println(arr[++i]);
        System.out.println("i is : "+i);
    }
}
