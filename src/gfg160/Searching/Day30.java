package gfg160.Searching;

public class Day30 {
    int search(int[] arr, int key) {
        // Complete this function
        int low = 0;
        int high = arr.length-1;
        while(low < high){
            int mid = (low+high)/2;
            if(arr[mid] > arr[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        int pivot = low;

        if(key >= arr[pivot] && key <= arr[arr.length-1]){
            return binarySearch(arr,pivot,arr.length-1,key);
        }
        else{
            return binarySearch(arr,0,pivot-1,key);
        }



    }

    int binarySearch(int[] arr,int low, int high, int key){
        while(low <= high){
            int mid = (low+high)/2;
            if(key < arr[mid]){
                high = mid-1;
            }
            else if(key > arr[mid]){
                low = mid+1;
            }
            else return mid;
        }
        return -1;
    }
}
