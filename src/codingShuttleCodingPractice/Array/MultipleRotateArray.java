package codingShuttleCodingPractice.Array;

public class MultipleRotateArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int[] newArr = new int[2*n];
        for(int i = 0;i<2*n;i++){
            newArr[i] = arr[i%5];
        }
        System.out.println(newArr);
        for(int a: newArr) System.out.print(a+" ");
    }
}
