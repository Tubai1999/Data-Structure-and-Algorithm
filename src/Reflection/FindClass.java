package Reflection;

public class FindClass {
    public static void main(String[] args) {
        Class obj = Student.class;
        System.out.println(obj.getName());
    }
}

class Student{

}
