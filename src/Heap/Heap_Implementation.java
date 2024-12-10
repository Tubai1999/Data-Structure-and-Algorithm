package Heap;

public class Heap_Implementation {
    static int size=4;
    static int count=0;
    

    public static void main(String[] args) {

//        int[] arr = new int[size];
//        insert(1,arr);
//        insert(10,arr);
//        insert(2,arr);
//        insert(7,arr);insert(8,arr);

//        printHeap(arr);
//        System.out.println(size);
//
//        System.out.println(delete(arr));
//        printHeap(arr);
//
//        System.out.println(delete(arr));
//        printHeap(arr);

        int[] buildHeap = {2,14,25,10};
//        build_heap(buildHeap);
//        printHeap(buildHeap);
        heapsort(buildHeap);

    }


    static void heapsort(int[] arr)
    {
        int arrSize = arr.length;
        build_heap(arr);
        for(int i=arrSize-1;i>=0;i++)
        {
            System.out.print(delete(arr)+" ");
        }

    }
    static void insert(int element,int[] arr)
    {
        if(count>size-1) System.out.println("array already full");
        else {
            arr[count] = element;
            int index1 = count;
            while (index1 > 0) {
                int parent = (index1 - 1) / 2;
                if (arr[parent] < arr[index1]) {
                    swap(arr, parent, index1);
                    index1 = parent;
                } else break;
            }
            count++;
        }
    }

    static int delete(int[] arr)
    {
//       int size =arr.length ;
        int ans = arr[0];
         arr[0] = arr[size-1];
        size--;
        heapify(0,arr);
        return ans;
    }

    static void build_heap(int[] arr)
    {
        int[] temp = new int[arr.length];
        temp = arr.clone();

        int size = temp.length;
        for(int i=size/2;i>=0;i--)
        {
            heapify(i,temp);

        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = temp[i];
        }
//        printHeap(arr);

    }

    static void heapify(int index,int[] arr)
    {
        if(index >= size) return;
//        System.out.println(size);
        int left = 2*index+1;
        int right = 2*index+2;
        int larger = index;
        if(left < size && arr[left] > arr[index]) larger = left;
        if(right<size && arr[right] > arr[larger]) larger = right;

        if(larger != index)
        {
            swap(arr,index,larger);
            heapify(larger,arr);
        }

    }

    static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printHeap(int arr[]){
       for(int a:arr)
       {
           System.out.print(a+" ");
       }
    }
}
