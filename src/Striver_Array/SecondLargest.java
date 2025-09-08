package Striver_Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 89, 6, 5, 87, 8};
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = -1;
        for(int a:arr){
            if(largest<a) {
                secondLargest = largest;
                largest = a;
            }
            else if(largest>a) {
                if (secondLargest<a) secondLargest = a;
            }
        }
//
//        for(int a:arr){
//            if(secondLargest<a && a != largest) secondLargest = a;
//        }
        System.out.println("second largest is: "+secondLargest);
    }
}
