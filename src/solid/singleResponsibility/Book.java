package solid.singleResponsibility;

public class Book {
    String titile;
    String author;
}

class PrintBook{
    void print(){
        System.out.println("function for printing book");
    }
}

class SaveBook{
    void save(){
        System.out.println("saving book for fututre reference");
    }
}
