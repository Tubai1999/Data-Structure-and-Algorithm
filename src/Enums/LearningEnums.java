package Enums;

enum season{
    winter,summer,autumn;

    public static void method(){
        System.out.println("inside enum method");
    }

}

public class LearningEnums {

    public static void main(String[] args) {
        season s = season.autumn;
        for (season season:season.values()) {
            System.out.println(season);
        }

        season.method();

    }
}
