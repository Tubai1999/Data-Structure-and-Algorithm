package Interface;

interface MessageService{
    void send();
}

class EmailService1 implements MessageService{
    public void send(){
        System.out.println("email send to user");
    }
}

class SmsService implements MessageService{
    public void send(){
        System.out.println("sms send to user");
    }
}

class NotificationService{
    private MessageService messageService;
    NotificationService(MessageService messageService){
        this.messageService = messageService;
    }
    void sendNotification(){
        messageService.send();
    }

}

public class LooseCoupling {
    public static void main(String[] args) {
        MessageService email = new EmailService1();
        MessageService sms = new SmsService();
        NotificationService notificationService = new NotificationService(email);
        notificationService.sendNotification();
    }
}
