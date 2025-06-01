package SingletonClass.Practice;

import Constructor.LearnConstructor3;

public class Main {
    public static void main(String[] args) {
        Eager.getInstance();
        Lazy.method();
        Synchronize.method();
    }
}
