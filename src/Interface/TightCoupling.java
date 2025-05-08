package Interface;

class EmailService{
    public void sendEmail(){
        System.out.println("sending email");
    }
}

public class TightCoupling {
    public static void main(String[] args) {
        EmailService emailObj = new EmailService();
        emailObj.sendEmail();
    }
}
