package practiceInterview;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,45,9,86,35};
//        int[] arr = new int[]{5,4,3};
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int a:arr) System.out.print(a+" ");
    }
}
