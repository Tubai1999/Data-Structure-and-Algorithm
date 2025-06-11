package Collection;

class ArrayListImpl<T>{
    private Object[] dataArr;
    private int size=0;
    private int capacity=10;
    ArrayListImpl(){
        dataArr = new Object[capacity];
    }
    //add element into ArrayList
    void addElement(T val){
        ensureArray();
        dataArr[size++] = val;
    }
    void ensureArray(){
        if(size+1 == capacity){
            capacity = capacity*2;
            Object[] newArr = new Object[capacity];
            for(int i = 0;i<size;i++){
                newArr[i] = dataArr[i];
            }
            dataArr = newArr;
        }

    }

    public void removeFromArray(int index){
        if(index>=size || index<0){
            throw new RuntimeException("invalid index");
        }
    }
}

public class ArrayListImplementation {
}
