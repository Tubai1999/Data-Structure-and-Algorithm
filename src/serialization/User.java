package serialization;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String userName;
    transient private String password;
    User(String name, String userName,String password){
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

    void displayInfo(){
        System.out.println("name: "+ userName);
        System.out.println("userName: "+userName);
        System.out.println("password: "+password);
    }
}
