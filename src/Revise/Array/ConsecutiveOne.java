package Revise.Array;

public class ConsecutiveOne {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int n = arr.length;

        for(int i=1;i<n;i++){
            int count = 1;
            int j = i;
            while (j<n){
                if(arr[j-1]==arr[j]) {
                    count++;j++;
                }
                else break;
            }
            System.out.println(count);
        }
    }
}
