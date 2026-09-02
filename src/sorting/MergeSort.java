package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,2,78,56,3,6,5,9};int n= arr.length;
        mergeHelper(arr,0,n-1);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    static void mergeHelper(int[] arr,int low, int high){
        if(low == high) return;
        int mid = (low+high)/2;
        mergeHelper(arr,low,mid);
        mergeHelper(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    static void merge(int[] arr, int low, int mid, int high ){
        int[] temp = new int[high+1];
        int left = low;
        int right = mid+1;int i=0;
        while(left <= mid && right <= high){
            if(arr[left] < arr[right]) {
                temp[i++] = arr[left];
                left++;
            }
            else {
                temp[i++] = arr[right];
                right++;
            }
        }
        while(left <= mid){
            temp[i++] = arr[left];
            left++;
        }
        while (right <= high){
            temp[i++] = arr[right];
            right++;
        }
        for(int j = low; j<= high;j++){
            arr[j] = temp[j-low];
        }

    }
}
