package comparableComparator.comparator;

public class Employee {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age;
    }
}

