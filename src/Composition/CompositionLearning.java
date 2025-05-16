package Composition;

import java.math.RoundingMode;

class Room{
    int numOfRoom;
    Room(int numOfRoom){
        this.numOfRoom = numOfRoom;
    }

    void method1(){
        System.out.println("inside Room");
    }

}

class School{
    String name;
    private Room room;
    School(String name){
        this.name = name;
        room = new Room(3);
    }

    void method(){
        room.method1();
    }

}

public class CompositionLearning {
    public static void main(String[] args) {

    }
}
