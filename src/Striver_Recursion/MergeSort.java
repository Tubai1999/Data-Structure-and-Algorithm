package Striver_Recursion;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,5,6,1,3,4,5};
        mergeSort(arr,0,arr.length-1);
        for(int a: arr) System.out.print(a+" ");
    }
    static void mergeSort(int[] arr, int low, int high){
        if(low == high) return;
        int mid = (high+low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr,mid+1,high);
        merge(arr, low, mid, high);

    }

    static void merge(int[] arr, int low, int mid, int high){
        int n1 = mid-low+1;
        int n2 = high-mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        for(int i = 0;i<n1;i++){
            leftArr[i] = arr[low+i];
        }
        for(int i = 0;i<n2;i++){
            rightArr[i] = arr[mid+1+i];
        }

        int i=0, j=0;
        int k = low;
        while(i<n1 && j<n2){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }
            else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }

    }
}
