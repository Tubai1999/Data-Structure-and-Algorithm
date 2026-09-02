package practiceInterview.synechron.Encapsulation;

public class Employee {
    private String name;
    private int id;

    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}
