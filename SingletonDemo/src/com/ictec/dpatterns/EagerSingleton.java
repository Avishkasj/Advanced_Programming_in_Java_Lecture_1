package com.ictec.dpatterns;

public class EagerSingleton {
    //creating a private static instance
    private static EagerSingleton es = new EagerSingleton();
    //Make constructor private
    private EagerSingleton() {
    }

    //Return the only object available
    public static EagerSingleton getInstance(){
        return es;
    }

    //Sample method to test
    public void showMessage(){
        System .out.println("Hello From Eager Singleton...!!!");
    }
}
