package AccessSpecifier2;

import AccessSpecifier1.Tiger;

public class Taigun extends Tiger {

    public void invokeTaigun(){
        System.out.println("invoked taigun");
        invokePrivateTaigun();
        invokeTigerProtected();
    }

    private void invokePrivateTaigun(){
        System.out.println("private method invoked");
    }


}
