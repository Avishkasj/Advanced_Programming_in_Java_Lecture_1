package com.ictec.dpatterns;

public class SingletonDemo {
    public static void main(String[] args) {
        //Testing the Singleton variations
        EagerSingleton eager = EagerSingleton.getInstance();
        eager.showMessage();

        LazySingleton lazy = LazySingleton.getInstance();
        lazy.showMessage();

        StaticSingleton staticSin = StaticSingleton.getInstance();
        staticSin.showMessage();

        ThreadSafeSingleton tSafe = ThreadSafeSingleton.getInstance();
        tSafe.showMessage();

        BillPughSingleton bPugh = BillPughSingleton.getInstance();
        bPugh.showMessage();

        //Tryout following to identify the singleton
        //System.identityHashCode(yourObject);
    }

}
