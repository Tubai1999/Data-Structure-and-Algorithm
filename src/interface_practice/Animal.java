package interface_practice;

@FunctionalInterface
public interface Animal {
     void walking();

    default int defaultMethod(){
        System.out.println("inside default method");
        return 1;
    }

    static int staticMethod(){
        System.out.println("inside static method");
        return 1;
    }

    String toString();
}

