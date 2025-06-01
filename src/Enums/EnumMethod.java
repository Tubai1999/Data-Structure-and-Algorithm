package Enums;

enum weekDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY;

    public void defaultMethod(){
        System.out.println("inside default method");
    }
}

public class EnumMethod {
    public static void main(String[] args) {
        weekDays val = weekDays.MONDAY;
        val.defaultMethod();
    }
}
