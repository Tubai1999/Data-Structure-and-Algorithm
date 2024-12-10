package Array;

import java.util.Arrays;

public class waveArray {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        nonLexiographicallySorted(arr);
        printArray(arr);
        //1,2,3,4,5
    }
    static void lexiographicallySorted(int[] arr){ //O(nlogn) it will return lexiographically sorted ans
        Arrays.sort(arr);

        for(int i=1;i<arr.length;i+=2){
            if(arr[i]>arr[i-1]) swap(arr,i,i-1);
        }
    }
    static void nonLexiographicallySorted(int[] arr){ //O(n) better but not lexiographically sorted
        for(int i=1;i<arr.length;i+=2){
            if(arr[i-1]<arr[i]) swap(arr,i,i-1);
            if((i+1)<arr.length && arr[i]>arr[i+1]) swap(arr,i,i+1);
        }

    }
    static  void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void printArray(int[] arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }

}
