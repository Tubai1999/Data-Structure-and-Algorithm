package JavaOOPS_preparation;
import java.lang.*;

//public class Employee implements Comparable<Employee> {
public class Employee implements Comparable<Employee> {
    int age;
    String name;

    int weight;

    Employee(int age,String name,int weight){
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Employee that) {
        return this.age- that.age;
    }

    @Override
    public String toString() {
        return name+" "+age+" "+weight;
    }
}
