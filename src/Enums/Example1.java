package Enums;

enum Days{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY;
}

public class Example1 {
    public static void main(String[] args) {
        for(weekDays singleDay: weekDays.values()){
            System.out.println(singleDay.ordinal());
        }
    }
}
