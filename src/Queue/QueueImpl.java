package Queue;

public class QueueImpl {
    public static void main(String[] args) {
        Myqueue queue = new Myqueue();
        queue.dequeue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(1);
        queue.enqueue(6);

        queue.printQueue();
        queue.dequeue();
        queue.printQueue();

    }

}

class Myqueue{
    private int[] arr;
    private int front, rear =-1;
    Myqueue(){
        arr = new int[5];
        front = rear = -1;
    }

    boolean enqueue(int data){
        if(isFull()){
            System.out.println("queue is already full we cannot add data");
            return false;
        }
        if(isEmpty()){
            front = 0;
        }
        rear++;
        arr[rear] = data;
        return true;
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty ,nothing present to delete");
            return -1;
        }
        int temp = arr[front];
        if(front == rear) {
            front = rear = -1;
            return temp;
        }
        front ++;
        return temp;
    }

    boolean isFull(){
        if(rear == arr.length-1) return true;
        else return false;
    }
    boolean isEmpty(){
        if(front == -1) return true;
        else return  false;
    }

    void printQueue(){
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

class MyCircularQueue{
    private int[] arr;
    private int front, rear =-1;
    MyCircularQueue(){
        arr = new int[5];
        front = rear = -1;
    }

    boolean isFull(){
        if(front ==0 && rear == arr.length-1) return true;
        if(rear+1 == front) return true;
        return false;
    }
    boolean isEmpty(){
        if(front == -1) return true;
        return false;
    }

    boolean enqueue(int data){
        if(isFull()) return false;
        if(isEmpty()) front = 0;
        rear = (rear+1)%arr.length;
        arr[rear] = data;
        return true;
    }

    int dequeue(){
        if(isEmpty()) {
            System.out.println("nothing to delete");
            return -1;
        }
        int temp = arr[front];
        if(front == rear){
            front = rear = -1;
            return temp;
        }
        front = (front+1)%arr.length;
        return temp;
    }

    void printQueue(){
        if(front <= rear){
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        else {
            for(int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
            }
            for(int j=0;j<=rear;j++){
                System.out.println(arr[j]+" ");
            }
        }


    }

}
