package GenericClass;

class Generic<T>{
    T value;
    Generic(){

    }
    Generic(T value){
        this.value = value;
    }
    void display(){
        System.out.println("inside display");
    }
}

class SubGeneric extends Generic<String>{
    void display(){
        System.out.println(value);
    }
//    SubGeneric(){
//        super("ff");
//    }
}

public class MainExample4 {
    public static void main(String[] args) {
//        Generic<Integer> obj = new Generic<>(10);
//        obj.value = 10;
//        System.out.println(obj.value);
//        if (obj.value == 10) System.out.println("same");
        SubGeneric obj1 = new SubGeneric();
        obj1.display();;
    }
}
