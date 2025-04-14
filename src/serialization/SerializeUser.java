package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;



public class SerializeUser {
    public static void main(String[] args) {
        User  user = new User("tridib","tsamanta","ksfgkk");
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"))){
            out.writeObject(user);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
