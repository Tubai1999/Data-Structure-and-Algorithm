package Revise.Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,54,2,3,9};
        int firstLargest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(firstLargest<arr[i]){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(secondLargest<arr[i]) secondLargest=arr[i];
        }
        System.out.println(secondLargest);
    }
}
