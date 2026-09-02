package Practice.SpringFeature;

public class FieldInjection {
    public static void main(String[] args) {
        NotificationService notificationService = new Email();
        notificationService.send();
    }
}


interface NotificationService{
    void send();
}

class Email implements NotificationService{
    @Override
    public void send() {
        System.out.println("Email has been sent");
    }
}
class Sms implements NotificationService{

    @Override
    public void send() {
        System.out.println("sms has been sent");
    }
}
