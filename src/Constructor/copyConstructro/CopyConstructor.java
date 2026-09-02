package Constructor.copyConstructro;

class CopyConstructorHelper{
    int id;
    String name;
    CopyConstructorHelper(int id, String name){
        this.id = id;
        this.name = name;
    }
    CopyConstructorHelper(CopyConstructorHelper cObj){
        id = cObj.id;
        name = cObj.name;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        CopyConstructorHelper obj = new CopyConstructorHelper(10,"tridib");
        CopyConstructorHelper newObj = new CopyConstructorHelper(obj);
    }
}
