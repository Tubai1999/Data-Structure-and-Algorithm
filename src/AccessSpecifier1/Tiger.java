package AccessSpecifier1;
//comment
public class Tiger {
    public void invokeTiger(){
        System.out.println("tiger invoked");
    }

    void invokeTigerDefault(){
        System.out.println("default method invoked");
    }

    protected void invokeTigerProtected(){
        System.out.println("protected method invoked");
    }
}
