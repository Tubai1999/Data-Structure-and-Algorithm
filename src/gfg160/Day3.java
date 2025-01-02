package gfg160;

public class Day3 {
    public void reverseArray(int arr[]) {
        // code here
        if(arr == null || arr.length == 0) return;
        int fromFirst = 0;
        int fromLast = arr.length-1;
        while(fromFirst < fromLast){
            swapElement(arr,fromFirst,fromLast);
            fromFirst++;fromLast--;
        }
    }

    void swapElement(int[] arr,int fromFirst,int fromLast){
        int temp = arr[fromFirst];
        arr[fromFirst] = arr[fromLast];
        arr[fromLast] = temp;
    }
}
