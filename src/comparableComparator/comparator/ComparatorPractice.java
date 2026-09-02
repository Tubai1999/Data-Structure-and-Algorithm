package comparableComparator.comparator;

import java.util.*;

class StudentSortByAge implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}
class StudentSortByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
class Student{
    int id;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String name;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    int age;
}

public class ComparatorPractice {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"tridid",25));
        students.add(new Student(2,"sonu",35));
        students.add(new Student(3,"Rajkumar",27));
        Collections.sort(students, new StudentSortByAge());
        for(Student a:students) System.out.print(a+" ");
        System.out.println();
//        Collections.sort(students, new StudentSortByName());
        Collections.sort(students, ( s1, s2)-> s1.name.compareTo(s2.name));
        for(Student a:students) System.out.print(a+" ");
        System.out.println();
        Integer[] arr = {4,5,4,7,1};
        Arrays.sort(arr,(a,b)->b-a);
        for(int a:arr) System.out.println(a);
    }
}
