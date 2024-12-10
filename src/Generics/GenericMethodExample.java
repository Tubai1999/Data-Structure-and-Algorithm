package Generics;

public class GenericMethodExample {

    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5};
        String[] arr1 = {"sggv","fgvd","dgvdr"};
        printArray(arr);
        printArray(arr1);
    }
    static <T> void printArray(T[] arr){
        for(T element:arr){
            System.out.print(element+" ");
        }
    }
}
