package SingletonClass.Practice;

public class BillPugh {
    private BillPugh(){

    }
    private static class innerClass{
        private static BillPugh billPugh = new BillPugh();
    }

    private static BillPugh method(){
        return innerClass.billPugh;
    }
}
