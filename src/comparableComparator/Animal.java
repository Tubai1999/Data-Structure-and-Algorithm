package comparableComparator;

public class Animal implements Comparable<Animal> {
    int age;
    String name;
    Animal(int age,String name)
    {
        this.age = age;
        this.name = name;
    }
    @Override
   public String toString(){
        return "Animal{"+"age:"+age
                +" name:"+name+"}"+'\n';
    }

    @Override
    public int compareTo(Animal that) {
//        return this.age-that.age;
        return this.name.compareTo(that.name);
    }
}
