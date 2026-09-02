package GenericClass;


class Example{
    Object value;
    public Object getValue(){
        return value;
    }
    public void setValue(Object value){
        this.value = value;
    }
}
public class MainExample1 {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.setValue(1);
        int val = (int)obj.getValue();
//        System.out.println(obj.getValue());
    }

}
