package Interface;


interface calculator{
    int calculation(int a,int b);
}

public class PracticeInterface {

//    public int calculation(int a,int b){
//        return a+b;
//    }

    public static void main(String[] args) {
        calculator obj = (a,b) -> a+b;
    }
}
