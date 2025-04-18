package Interface;

interface car{
    void starting(String name);
}

//class Bus implements car{
//    public void starting(String name){
//        System.out.println(name);
//    }
//}

public class AnnonymousClass {
    public static void main(String[] args) {
//        car obj = (String name) -> {
//            System.out.println(name);
//        };
//        obj.starting("tridib");

//        car obj = new Bus();
//        obj.starting("drgre");

        car obj = new car(){
            public void starting(String name){
                System.out.println(name);
            }
        };
        obj.starting("tridib");
    }
}
