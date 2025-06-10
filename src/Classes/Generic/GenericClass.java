package Classes.Generic;

class Generic1<T>{
    T value;
    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Generic1<Integer> intObj = new Generic1<>();
        intObj.setValue(10);
        System.out.println(intObj.getValue());
    }
}
