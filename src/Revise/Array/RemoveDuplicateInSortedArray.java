package Revise.Array;

public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4};
        int n = arr.length;

        int lastUnique = 0;
        for(int i=1;i<n;i++){
            if(arr[lastUnique]==arr[i]) continue;
            else {
                arr[lastUnique+1] = arr[i];
                lastUnique++;
            }
        }
        for(int j=0;j<lastUnique+1;j++){
            System.out.println(arr[j]);
        }
    }
}
