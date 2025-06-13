package Classes;


  class Upper{
    private final int id;
    private final String name;
    Upper(int id, String name){
        this.id = id;
        this.name = name;
    }

}

public class ImmutableClass {


    public static void main(String[] args) {
        Upper obj = new Upper(1,"tridib");
//        ImmutableClass obj = new ImmutableClass();
    }
}
