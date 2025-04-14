package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeUser {
    public static void main(String[] args) {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"))){
            User user = (User)in.readObject();
            user.displayInfo();
        }catch(Exception e){

        }
    }
}
