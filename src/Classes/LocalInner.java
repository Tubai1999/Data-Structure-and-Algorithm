package Classes;



class Outer{
    int val = 10;
    static int checkVal = 11;
    void methodOuter(){
        class Inner{
            void methodInner(){
                System.out.println(val+checkVal);
            }
        }
        Inner obj = new Inner();
        obj.methodInner();
    }
}
public class LocalInner {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.methodOuter();
    }
}
