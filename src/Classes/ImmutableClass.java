package Classes;

  class Upper{
    private final int id;
    private final String name;
      @Override
      public String toString() {
          return "Upper{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  '}';
      }
      Upper(int id, String name){
        this.id = id;
        this.name = name;
    }
}

//

public class ImmutableClass extends Upper {
    ImmutableClass(int id, String name) {
        super(id, name);
    }

    public static void main(String[] args) {
        Upper obj = new Upper(1,"tridib");

        ImmutableClass newObj = new ImmutableClass(4,"samanta");
        System.out.println(obj);
    }
}
