package solid.openClose;

public class NotificationService { // not maintaing openClose principle
    void notification(String type){
        if(type == "sms") System.out.println("send sms ");
        else if(type == "slack") System.out.println("send slack notification");
    }
}

// to overcome this issue create one interface with send method and whenever you want to send different type of notification
