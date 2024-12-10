package Constructor;

public class LearnConstructor {
    int age;
    public LearnConstructor(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        LearnConstructor obj = new LearnConstructor(20);
        System.out.println(obj.age);
    }
}
