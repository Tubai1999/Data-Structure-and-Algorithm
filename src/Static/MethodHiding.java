package Static;

public class MethodHiding {
    public static void main(String[] args) {
        Person p = new Doctor();
        p.method();
    }
}

class Person{
    static void method(){
        System.out.println("inside person class");
    }
}

class Doctor extends Person{
    static void method(){
        System.out.println("inside doctor class");
    }
}
