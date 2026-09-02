package practiceInterview.synechron.Interface;

//public class MainCar implements Car{
//    public void honking(){
//        System.out.println("car is honking");
//    }
//
//    public static void main(String[] args) {
//        Car obj = new MainCar();
//        obj.honking();
//    }
//}
//public class MainCar {
//
//    public static void main(String[] args) {
//        Car obj = new Car() {
//            @Override
//            public void honking() {
//                System.out.println("honking");
//            }
//        };
//        obj.honking();
//    }
//}

public class MainCar {
    public static void main(String[] args) {
        Car obj = ()->{
            System.out.println("honking");
        };
        obj.honking();
    }
}
