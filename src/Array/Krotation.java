package Array;
//commeted
public class Krotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k=6;
        optimized(arr,k);
    }
    static void optimized(int[] arr,int k){
        k=k%arr.length;
            int temp[] = new int[2*arr.length];
            for(int i=0;i<2*arr.length;i++){
                temp[i] = arr[i%arr.length];
            }
            for(int x=k;x<arr.length+k;x++){
                System.out.print(temp[x]+" ");
            }
    }
    static  void bruteForce(int[] arr,int k)
    {
        for(int i=0;i<k;i++){
            int temp = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
    }
    static void printArr(int[] arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
