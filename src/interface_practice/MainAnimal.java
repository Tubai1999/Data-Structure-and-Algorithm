package interface_practice;

public class MainAnimal  {
    public void walking(){
        System.out.println("walking method got invoked");
    }


    public static void main(String[] args) {

//        Animal.staticMethod();
//        Animal obj = new MainAnimal();
//        obj.walking();
//        obj.defaultMethod();
//        System.out.println(obj.toString());

        //using annonymous class

//    Animal obj = new Animal(){
//        public void walking(){
//            System.out.println("it is walking");
//        }
//    };
//    obj.walking();

        Animal newObj = () -> {
            System.out.println("inside walking method");
        };
        newObj.walking();
    }

}
